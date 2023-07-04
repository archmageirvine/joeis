package irvine.oeis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.Channels;

import irvine.util.string.Date;

/**
 * Read a file with A-numbers, offsets and superclasses of jOEIS sequences
 * and generate a report regarding:
 * <ul>
 * <li>the deviations from the offsets in the OEIS</li>
 * <li>whether the sequence extends AbstractSequence</li>
 * <li>whether the sequence still implements Sequence, without extending AbstractSequence</li>
 * </ul>
 * @author Georg Fischer
 */
public final class AbstractInspector {

  /** Empty constructor */
  private AbstractInspector() {
  }

  /**
   * Format a number as percentage
   * @param d number to be formatted
   * @param total compute percentage relative to this number
   * @return string of the form "dddddd = pp.pppp %"
   */
  private static String formatPercent(final int d, final int total) {
    return String.format("%6d = %7.4f %% out of %6d", d, d * 100.0 / total, total).replaceAll("\\,", ".");
  }

  /**
   * Main program.
   * @param args mode and name of file with tuples <code>A-number tab offset tab superclass</code>
   */
  public static void main(final String[] args) {
    String fileName = "-"; // default: read from STDIN
    String mode = "offi";
    int iarg = 0;
    if (args.length > 0) {
      mode = args[iarg++];
    }
    if (args.length > 1) {
      fileName = args[iarg++];
    }
    if (fileName.matches("\\-\\-?h(elp)?")) {
      System.out.print("Usage: java irvine.oeis.AbstractInspector [mode [- | filename]]\n"
          + "    mode = finite    : check number of terms against OEIS data\n"
          + "    mode = noabstract: which sequences do not extend AbstractSequence\n"
          + "    mode = offinspect: check getOffset against OEIS offsets\n"
          + "    mode = seqwoffset: which sequences implement Sequence, but do not extend AbstractSequence\n"
          + "    (only the first 5 letters of the mode are relevant)\n"
          + "    file contains tab-separated tuples: A-number, offset, superclass\n"
          );
      return;
    }
    final String srcEncoding = "UTF-8"; // Encoding of the input file
    String line; // current line from text file
    int total = 0;
    int pass = 0;
    int fail = 0;
    int miss = 0;
    System.out.println("# Starting report at " + Date.now());
    try {
      try (final BufferedReader lineReader = fileName.length() <= 0 || fileName.equals("-")
        ? new BufferedReader(new InputStreamReader(System.in, srcEncoding))
        : new BufferedReader(Channels.newReader(new FileInputStream(fileName).getChannel(), srcEncoding))) {
        while ((line = lineReader.readLine()) != null) { // read and process lines
          if (!line.matches("\\s*#.*")) { // is not a comment
            ++total;
            if (total % 1024 == 0) { // progress
               System.err.println("# " + String.format("+%5d: ", total) + line);
            }
            final String[] parms = line.split("\\s+");
            final String aNumber = parms[0];
            try {
              final int parm1 = Integer.parseInt(parms[1]);
              final String superClass = parms.length > 2 ? parms[2] : "";
              final Sequence seq = SequenceFactory.sequence(aNumber);
              if (false) {

              } else if (mode.startsWith("finit")) {
                if (seq instanceof FiniteSequence) {
                  final FiniteSequence seq2 = (FiniteSequence) seq;
                  final int noTerms = seq2.size();
                  if (noTerms == parm1) {
                    ++pass;
                  } else {
                    ++fail;
                    System.out.println(aNumber + "\t" + noTerms + " -> " + parm1 + "\t" + superClass);
                  }
                } else {
                  ++miss;
                }

              } else if (mode.startsWith("noabs")) {
                if (!(seq instanceof AbstractSequence)) {
                  System.out.println(aNumber + "\t" + parm1 + "\t" + superClass);
                  ++fail;
                } else {
                  ++pass;
                }

              } else if (mode.startsWith("offin")) {
                final int seqOffset = seq.getOffset();
                if (seqOffset == parm1 || (seq instanceof DeadSequence)) {
                  ++pass;
                } else {
                  ++fail;
                  System.out.println(aNumber + "\t" + seqOffset + " -> " + parm1 + "\t" + superClass);
                }

              } else if (mode.startsWith("seqwo")) {
                if (!(seq instanceof AbstractSequence)) {
                  ++fail;
                  System.out.println(aNumber + "\t" + parm1 + "\t" + superClass);
                } else {
                  ++pass;
                }

              } else {
                System.err.println("invalid mode " + mode);
                System.exit(1);
              }

            } catch (final NumberFormatException e) {
              System.out.println(aNumber + " skipped because parm1 " + parms[1] + " is out of range");
            } catch (final UnimplementedException exc) {
              //System.out.println("# " + aNumber + " nyi");
            } catch (final RuntimeException exc) {
              System.out.println("#?? " + aNumber + ": " + exc.getMessage());
            }
          } // is not a comment
        } // while ! eof
      }
    } catch (final RuntimeException | IOException exc) {
      System.out.println("# " + exc.getMessage());
    }

    // final String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    // 2023-06-19      07:58:43        159501  Java classes =  43.8967 % out of        363355  OEIS sequences are implemented by jOEIS
    String subset = "";
    if (mode.startsWith("finit")) {
      subset = " with wrong size of FiniteSequence";
    } else if (mode.startsWith("noabs")) {
      subset = " do not extend AbstractSequence";;
    } else if (mode.startsWith("offin")) {
      total -= miss;
      subset = " with defined, but wrong offset";
    } else if (mode.startsWith("seqwo")) {
      subset = " implement Sequence only";
    } else {
      System.err.println("invalid mode " + mode);
    }
    System.out.println(Date.now() + "\t" + mode + "\t" + formatPercent(fail, total) + subset);
    System.out.println("# End at " + Date.now());
  }
}

