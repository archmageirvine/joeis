/*  Read a list of A-numbers and appends the parameters of the sequences
 *  @(#) $Id: RecurrenceReflector.java $
 *  2022-10-16: clean-up
 *  2022-07-13: in joeis/internal/irvine/oeis
 *  2021-07-03: PolynomialRootSequence
 *  2021-05-01: revitalized
 *  2021-01-29: LatticeCoordinationSequence / latti -> gener
 *  2021-01-23, Georg Fischer: copied from BatchTest
 */
package irvine.oeis;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.channels.Channels;
import java.nio.charset.StandardCharsets;

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;
import irvine.oeis.recur.GeneratingFunctionSequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.recur.LinearRecurrence;
import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.recur.PeriodicSequence;

/** 
 * Read a list of A-numbers and appends the parameters of the sequences.
 * The output file is tab-separated: aseqno, callcode, offset, matrix, init, dist, gftype
 * @author Dr. Georg Fischer
 */
public class RecurrenceReflector {
  /** CVS identifier. */
  public static final String CVSID = "@(#) $Id $";

  /**
   * This program's version.
   */
  private static final String VERSION = "RecurrenceReflector V1.2";

  /**
   * A-number of sequence currently tested.
   */
  private String mAseqno;

  /**
   * Debugging level: 0 = none, 1 = some, 2 = more.
   */
  private int mDebug;

  /**
   * Encoding of the input file
   */
  private String mSrcEncoding;

  /**
   * No-args Constructor
   */
  public RecurrenceReflector() {
    mDebug = 0;
    mSrcEncoding = "UTF-8";
  }

  /**
   * Get a String representation of a Z array.
   * @return a list of terms of the form "[0,1,1,2,1]".
   */
  public static String getVectorString(final Z[] vector) {
    final StringBuilder result = new StringBuilder(256);
    for (int j = 0; j < vector.length; ++j) {
      result.append(j == 0 ? '[' : ',');
      result.append(vector[j]);
    } // for j
    result.append(']');
    return result.toString();
  }

  /**
   * Get a String representation of an array of vectors for a periodic recurrence
   * @param plen length of the period
   * @return a String of the form "[0,1,0,0,...0,-1]" with plen-1 zeroes.
   */
  public static String getPeriodicRecurrence(final int plen) {
    final StringBuilder result = new StringBuilder(256);
    result.append("[0,1");
    for (int j = 1; j < plen; ++j) {
      result.append(",0");
    } // for j
    result.append(",-1]");
    return result.toString();
  }

  /**
   * Get a String representation of an array of vectors for a periodic recurrence
   * @param nrow number of factors in a summand + 1
   * @param sign1 = +1 for sum, = -1 for alternating sum starting with "-"
   * @param sign2 dito
   * @return a vector for the recurrence, for example
   * <pre>
   * signature (1,3,-3,-3,3,1,-1) for A228958(n) = 1*2 + 3*4 + 5*6 + 7*8
   * signature (1,-3,3,-3,3,-1,1) for A319885(n) = 2*1 - 4*3 + 6*5 - 8*7 + 10*9
   * signature (1,0,4,-4,0,-6,6,0,4,-4,0,-1,1) for a(n) = 1*2*3 + 4*5*6
   * signature (1,0,-4,4,0,-6,6,0,-4,4,0,-1,1) for a(n) = 3*2*1 - 6*5*4 + 9*8*7 -
   * signature (1,0,0,5,-5,0,0,-10,10,0,0,10,-10,0,0,-5,5,0,0,1,-1)
   * </pre>
   */
  public static String getBlockRecurrence(final int nrow, final int sign1, final int sign2) {
    final int[] binom = new int[nrow + 1];
    binom[0] = 1;
    for (int i = 1; i <= nrow; ++i) { // build Pascal's triangle
      int temp = 0;
      for (int j = i; j > 0; --j) {
        binom[j] = temp + binom[j - 1];
        temp = binom[j - 1];
      } // for j
    } // for i
    final int sigLen = nrow * (nrow - 1) + 1;
    final int[] signature = new int[sigLen];
    int isig = 0;
    signature[isig++] = 1;
    int sign = sign1;
    for (int i = 1; i <= nrow; ++i) { // build the conventional signature
      for (int j = 1; j <= nrow - 3; ++j) { // (n 4) has one ",0"
        signature[isig++] = 0;
      } // for j
      signature[isig++] = sign * binom[i] * ((i & 1) == 0 ? sign1 : 1);
      sign = - sign;
      signature[isig++] = - signature[isig - 1];
    } // for i
    final StringBuilder result = new StringBuilder(256);
    result.append("[0");
    for (isig = signature.length - 1; isig >= 0; --isig) { // reverse order
      result.append(',');
      // [0    ,1,-1,-3,3,3,-3,1    ,-1] -> {1, -1, 3, -3, 3, -3, 1, -1}
      result.append(signature[isig] * ((sign1 < 0 && ((isig >> 1) & 1) == 1) ? -1 : 1));
    } // for isig
    result.append(",-1]");
    return result.toString();
  }

  /**
   * Get a String representation of a continued fraction period.
   * @param hseq underlying sequence
   * @return 3 Strings with parameters
   */
  public String[] getContinuedFractionRecurrence(final ContinuedFractionOfSqrtSequence hseq) {
    String[] result = new String[] { "conti", "", "" }; // default if reflection fails
    final StringBuilder buffer = new StringBuilder(1024);
    hseq.fillPeriod();
    final int plen = hseq.getPeriodLength();
    try {
      final Method thisNextMethod = hseq.getClass().getMethod("next");
      final Method contiNextMethod = ContinuedFractionOfSqrtSequence.class.getMethod("next");
      if (thisNextMethod.equals(contiNextMethod)) { // get the CF itself: repetition of periodic part
        result[0] = "contip";
        result[1] = getPeriodicRecurrence(plen); // MATRIX
        buffer.setLength(0);
        buffer.append('[');
        buffer.append(hseq.next().divide2().toString()); // root
        for (int iterm = 0; iterm < plen; ++iterm) {
          buffer.append(',');
          buffer.append(hseq.next().toString());
        }
        buffer.append(']');
        result[2] = buffer.toString(); // INIT
      } else { // test whether it's the numerator or denominator convergents sequence
        final int plen2 = plen << 1;
        final Z[] nums = new Z[plen2];
        final Z[] dens = new Z[plen2];
        final Z[] terms = new Z[plen2];
        int iterm = 0;
        while (iterm < plen) {
          nums[iterm] = hseq.getNumerator();
          dens[iterm] = hseq.getDenominator();
          terms[iterm] = hseq.next(); // does iterate(), iterateConvergent()
          ++iterm;
        }
        final int last = iterm - 1;
        if (terms[last].equals(nums[last]) || terms[last].equals(dens[last])) { // it was the numerator or denominator
          result[0] = "conti" + (terms[last].equals(nums[last]) ? "n" : "d");
          buffer.setLength(0);
          buffer.append("[0,");
          if ((plen & 1) == 0) { // even
            buffer.append('-');
          }
          buffer.append('1');
          for (int iz = 0; iz < plen - 1; ++iz) {
            buffer.append(",0");
          }
          buffer.append(',');
          buffer.append(nums[last].multiply2().toString());
          for (int iz = 0; iz < plen - 1; ++iz) {
            buffer.append(",0");
          }
          buffer.append(",-1]");
          result[1] = buffer.toString();
          while (iterm < plen2) { // fill so many terms as the order of the recurrence
            terms[iterm++] = hseq.next();
          }
          result[2] = getVectorString(terms);
        } else { // it was some different call - return empty Strings
        }
      }
    } catch (Exception exc) { // could not reflect next() method
    }
    return result;
  }

  /**
   * Process lines of the form:
   * <pre>A040954\tcallcode\t...</pre>
   * and reflect the corresponding sequence.
   * @param fileName name of input file or "-" for STDIN
   */
  public void processBatch(final String fileName) {
    final StringBuilder buffer = new StringBuilder(1024);
    try {
      final Method blockNextMethod = BlockMultAddSequence           .class.getMethod("next");
      final Method contiNextMethod = ContinuedFractionOfSqrtSequence.class.getMethod("next");
      final Method finitNextMethod = FiniteSequence                 .class.getMethod("next");
      final Method generNextMethod = GeneratingFunctionSequence     .class.getMethod("next");
      final Method holonNextMethod = HolonomicRecurrence            .class.getMethod("next");
      final Method lineaNextMethod = LinearRecurrence               .class.getMethod("next");
      final Method paddiNextMethod = PaddingSequence                .class.getMethod("next");
      final Method perioNextMethod = PeriodicSequence               .class.getMethod("next");
      final Method prepeNextMethod = PrependSequence                .class.getMethod("next");
      Method superNextMethod = null; // one of the above

      final String srcEncoding = "UTF-8"; // Encoding of the input file
      try (final BufferedReader lineReader =  fileName == null || fileName.length() <= 0 || fileName.equals("-")
        ? new BufferedReader(new InputStreamReader(System.in, srcEncoding))
        : new BufferedReader(Channels.newReader((new FileInputStream(fileName)).getChannel(), srcEncoding))
      ) {
        String line;
        Sequence seq = null;
        while ((line = lineReader.readLine()) != null) { // read and process lines
          if (line.startsWith("A")) { // valid A-number
            boolean cfOk = false; // assume that ContinuedFractionOfSqrtSequence could not be reflected
            final String[] parts = new String[8];
            final String[] elems = line.split("\\t", -1); // include trailing empty strings
            int ipart = 0;
            if (elems.length >= parts.length) {
              System.arraycopy(elems, 0, parts, 0, parts.length);
            } else { // elems has fewer
              System.arraycopy(elems, 0, parts, 0, elems.length);
              for (ipart = elems.length + 1; ipart < parts.length; ++ipart) {
                parts[ipart] = "";
              }
            }
            ipart = 0; // leave aseqno and callCode
            mAseqno = parts[ipart++];
            final String callCode = parts[ipart++];
            String termList = parts[ipart + 1]; // behind offset
            final String className = "irvine.oeis.a" + mAseqno.substring(1, 4) + '.' + mAseqno;
            try {

              if (callCode.startsWith("block")) { // operation code, e.g. A319885 kblocks 1       2       >>->>+  0
                superNextMethod = blockNextMethod;
                final BlockMultAddSequence hseq = (BlockMultAddSequence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset

                final String oper = hseq.getOper();
                final char lgt = oper.charAt(0);
                int pos = 1;
                while (lgt == oper.charAt(pos)) {
                  ++pos;
                }
                final int blockLen = pos;
                final int sign1 = oper.charAt(pos++) == '+' ? 1 : -1;
                int sign2 = sign1;
                if (pos > oper.length()) {
                    sign2 = - sign1;
                }
                parts[ipart++] = getBlockRecurrence(blockLen + 1, sign1, sign2); // MATRIX
                buffer.setLength(0);
                for (int iterm = blockLen * (blockLen + 1) + 1; iterm >= 1; --iterm) {
                  buffer.append(',');
                  buffer.append(hseq.next().toString());
                }
                buffer.append(']');
                parts[ipart++] = "[" + buffer.substring(1); // INIT
                parts[ipart++] = "0"; // dist
                parts[ipart++] = "0"; // gfType

              } else if (callCode.startsWith("conti")) { // root and period
                superNextMethod = contiNextMethod;
                final ContinuedFractionOfSqrtSequence hseq = (ContinuedFractionOfSqrtSequence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset
                final String[] cfrec = getContinuedFractionRecurrence(hseq);
                cfOk = cfrec[1].length() > 0;
                parts[1]       = cfrec[0]; // modified callCode
                parts[ipart++] = cfrec[1];
                parts[ipart++] = cfrec[2];
                parts[ipart++] = "0";
                parts[ipart++] = "0";

              } else if (callCode.startsWith("finit")) { // finite list followed by null (later: by zeroes)
                superNextMethod = finitNextMethod;
                final FiniteSequence hseq = (FiniteSequence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset
                parts[ipart++] = "[0]"; // MATRIX or later "[0,-1]"
                parts[ipart++] = getVectorString(hseq.getInitTerms()); // INIT
                parts[ipart++] = "0";
                parts[ipart++] = "0";

              } else if (callCode.startsWith("gener")
                    ||   callCode.startsWith("coord")
                    ||   callCode.startsWith("coxet")
                    ||   callCode.startsWith("latti")
                    ) { // fraction of two polynomials
                superNextMethod = generNextMethod;
                final GeneratingFunctionSequence hseq = (GeneratingFunctionSequence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset
                final Z[] num = hseq.getNum();
                final Z[] den = hseq.getDen();
                final int mlen = num.length;
                final int dlen = den.length;
                buffer.setLength(0);
                for (int iterm = dlen - 1; iterm >= 1; --iterm) {
                  buffer.append(',');
                  buffer.append(den[iterm].toString());
                }
                buffer.append(',');
                buffer.append(den[0].toString());
                parts[ipart++] = "[0" + buffer.toString() + "]"; // MATRIX
                buffer.setLength(0);
                for (int iterm = Math.max(dlen, mlen); iterm >= 1; --iterm) {
                  buffer.append(',');
                  buffer.append(hseq.next().toString());
                }
                buffer.append(']');
                parts[ipart++] = "[" + buffer.substring(1); // INIT
                parts[ipart++] = "0";
                parts[ipart++] = String.valueOf(hseq.getGfType());

              } else if (callCode.startsWith("holon")    // HolonomicRecurrence
                      || callCode.startsWith("polyn")) { // PolynomialRootSequence
                superNextMethod = holonNextMethod;
                final HolonomicRecurrence hseq = (HolonomicRecurrence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                hseq.normalize();
                parts[ipart++] = String.valueOf(hseq.getOffset());
                parts[ipart++] = hseq.getPolyString();
                parts[ipart++] = hseq.getInitString();
                parts[ipart++] = String.valueOf(hseq.getDistance());
                parts[ipart++] = String.valueOf(hseq.getGfType());

              } else if (callCode.startsWith("linea")) { // reversed signature + initial terms
                superNextMethod = lineaNextMethod;
                final LinearRecurrence hseq = (LinearRecurrence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset
                parts[ipart++] = getVectorString(hseq.getRecurrence())
                  .replaceAll("\\[", "[0,").replaceAll("\\]", ",-1]"); // +constant, -a(n) (align to HolonomicRecurrence)
                parts[ipart++] = getVectorString(hseq.getInitTerms());
                parts[ipart++] = "0";
                parts[ipart++] = "0"; // gfType = ordinary

              } else if (callCode.startsWith("paddi")
                      || callCode.startsWith("weylg")) { // padding: padding terms repeated, overlaid by init terms
                superNextMethod = paddiNextMethod;
                final PaddingSequence hseq = (PaddingSequence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset
                final Z[] terms = hseq.getInitTerms();
                final Z[] pads = hseq.getPaddingTerms();
                final int tlen = terms.length;
                final int plen = pads.length;
                parts[ipart++] = getPeriodicRecurrence(plen); // MATRIX
                buffer.setLength(0);
                for (int iterm = 0; iterm < tlen + plen; ++iterm) {
                  buffer.append(',');
                  buffer.append(iterm < tlen ? terms[iterm].toString() : pads[iterm % plen].toString());
                }
                parts[ipart++] = "[" + buffer.substring(1) + "]"; // INIT
                parts[ipart++] = "0";
                parts[ipart++] = "0";

              } else if (callCode.startsWith("perio")) { // periodic
                superNextMethod = perioNextMethod;
                final PeriodicSequence hseq = (PeriodicSequence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset
                final Z[] terms = hseq.getInitTerms();
                parts[ipart++] = getPeriodicRecurrence(terms.length); // MATRIX
                parts[ipart++] = getVectorString(terms); // INIT
                parts[ipart++] = "0";
                parts[ipart++] = "0";

              } else if (callCode.startsWith("prepe")) { // PrependSequence
                superNextMethod = prepeNextMethod;
                final PrependSequence hseq = (PrependSequence) Class.forName(className).getDeclaredConstructor().newInstance();
                seq = hseq;
                ipart++; // skip offset
                final Sequence aseq = hseq.getSequence();
                if (aseq instanceof PeriodicSequence) {
                  PeriodicSequence pseq = (PeriodicSequence) aseq;
                  final Z[] period = pseq.getInitTerms();
                  parts[ipart++] = getPeriodicRecurrence(period.length);
                  parts[ipart++] = (getVectorString(hseq.getTerms()) + getVectorString(period)).replaceAll("\\]\\[", "\\,"); // INIT
                  parts[ipart++] = "0";
                  parts[ipart++] = "0";
                } else {
                  seq = null; // ignore it below
                }

              } else { // ignore
              } // end of switch for callCodes

              if (seq == null) {
                // ignore
              } else if (parts[3].length() < 8192 && parts[4].length() < 4096) {
                parts[ipart++] = termList.replaceAll("\\,\\-?\\d*\\Z",""); // last may be incomplete, remove it
                final Method thisNextMethod = seq.getClass().getMethod("next");
                if (cfOk || thisNextMethod.equals(superNextMethod)) {
                  for (ipart = 0; ipart < parts.length; ++ipart) { // print a tab-separated record
                    if (ipart > 0) {
                      System.out.print("\t");
                    }
                    System.out.print(parts[ipart]);
                  } // for ipart
                  System.out.println();
                } else {
                  System.err.println("# " + mAseqno + "\t" + callCode + "\tdoesn't use super.next()");
                }
              } else {
                System.err.println("# " + mAseqno + "\t" + callCode + "\trecord length > 8192 + 4096");
              }
            } catch (final Exception exc) {
              System.err.println("# cannot construct " + className + ", exception: " + exc.getMessage());
              exc.printStackTrace();
            }
          } else { // commented out, empty ...
            // ignore lines without A-numbers
          }
        } // while ! eof
      }
    } catch (final Throwable exc) {
      System.err.println("FATAL - cannot read \"" + fileName + "\" - " + exc.getMessage());
    }
  }

  /**
   * Process the commandline arguments
   * @param args commandline arguments:
   * <ul>
   * <li>-d level debugging level: 0=none, 1=some, 2=more (default: 0)</li>
   * <li>input filename or "-" for STDIN</li>
   * </ul>
   */
  public void processArguments(final String[] args) {
    int iarg = 0;
    if (args.length == 0) {
      System.out.print("Usage: RecurrenceReflector [-d level] {- | filename}\n"
        + "    -d level      debugging level: 0=none, 1=some, 2=more (default: 0)\n"
      );
      return;
    }
    String fileName = "-"; // default: read from STDIN
    while (iarg < args.length && args[iarg].startsWith("-")) {
      final String arg = args[iarg++];
      if (arg.startsWith("-d")) {
        try {
          mDebug = Integer.parseInt(args[iarg++]);
        } catch (final Throwable exc) {
          // silently assume default
        }
      }

    } // while iarg
    if (iarg < args.length) {
      fileName = args[iarg++];
    }
    processBatch(fileName);
  }

  /**
   * Main method
   * @param args command line arguments: filename or "-"
   */
  public static void main(final String[] args) {
    (new RecurrenceReflector()).processArguments(args);
  }

} // RecurrenceReflector
