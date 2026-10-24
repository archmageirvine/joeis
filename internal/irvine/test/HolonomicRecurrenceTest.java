/* Test class HolonomicRecurrence, determine init terms, run backwards
 * @(#) $Id$
 * 2021-02-15: with Z in ramath and joeis-lite
 * 2020-04-10: -t gftype
 * 2019-12-12: -p polylist -i initterms
 * 2019-12-08: Georg Fischer
 */
package irvine.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A holonomic sequence is defined by a recurrence equation
 * where the factors <code>P[i], i=0..k</code> of <code>a[n-i], i=0..k</code> are either constant
 * (like in <code>LinearRecurrence.java</code>), or are polynomials in <code>n</code>..
 * The equation is written in the form of an <code>annihilator</code>:
 * <pre>
 * P[0]*1 + P[1]*a[n-k+1] + P[2]*a[n-k+2] + ...+ P[k-1]*a[n-k+k-1] + P[k]*a[n] = 0
 * </pre>
 * <code>k-1</code> is the order of the recurrence,
 * and <code>p[i], i= 0..k</code> are the polynomials (or constants) in <code>n</code>.
 * <code>a[n]</code> is the next term to be computed.
 * The recurrence equation may have a term <code>P[0]</code> which is independent
 * of any sequence term.
 * This class runs {@link HolonomicRecurrence}
 * <ul>
 * <li>with parameter lists read from a file,</li>
 * <li>for the determination of the necessary initial terms,</li>
 * <li>backwards to get a new sequence.</li>
 * </ul>
 * @author Georg Fischer
 */
public class HolonomicRecurrenceTest {
  protected static int sDebug = 0;

  /** Fields of the input line */
  private String[] mParms;

  /** A-number of the OEIS sequence */
  private String mAseqno;

  /** Code for a specific generation process in joeis-lite */
  private String mCallCode;

  /** Number of terms to be generated */
  private static int sNumTerms;

  /** Offset of the sequence, as String */
  private int mOffset;

  /** Distance d > 0 if a(n+d) is the highest and next element to be computed (0 <= d <= k). */
  private int mNDist;

  /** List of vectors for the coefficient polynomials */
  private String mPolyString;

  /** Vectors for the initial terms */
  private String mInitString;

  /** Current index for {@link #mParms} */
  private int mIparm;

  /** Type of the generating function: 0 = ordinary, 1 = exponential. */
  private int mGfType;

  /** Instance to be tested. */
  private HolonomicRecurrence mHolRec;

  /**
   * Empty constructor.
   */
  protected HolonomicRecurrenceTest() {
    mHolRec = new HolonomicRecurrence(0, "[0,1,1,-1]" /* Fibonacci */, "[0,1]", 0);
    mGfType = 0; // ordinary
  }

//  /**
//   * Evaluate the recurrence and gets a list of terms.
//   * @param holRec instance to be reversed
//   * @return a call to RecurrenceTable.
//   */
//  private String getMathematica(HolonomicRecurrence holRec) {
//    StringBuffer result = new StringBuffer(256);
//    int ind = 0;
//    result.append("RecurrenceTable[{");
//    for (ind = 0; ind < mPolyString.size(); ind ++) { // polynomials
//      Z[] poly = mPolyString.get(ind);
//      for (int iexp = 0; iexp < poly.length; iexp ++) {
//        if (iexp > 0) {
//          result.append(',');
//        }
//      } // iexp
//      result.append(",a[");
//      result.append(ind);
//      result.append("]=");
//      result.append(mInitString[ind]);
//    } // for ind - polynomials
//
//    result.append("=0, ");
//    for (ind = 0; ind < mInitString.size(); ind ++) { // initial terms
//      result.append(",a[");
//      result.append(ind);
//      result.append("]=");
//      result.append(mInitString[ind]);
//    } // for ind - initial
//    result.append("},a,{n,");
//    result.append(mOffset);
//    result.append(",");
//    result.append(mNumTerms);
//    result.append("}]");
//    return result.toString();
//  } // getMathematica

  /**
   * Reverse a comma separated list of coefficients,
   * but do not change any sign.
   * @param coeffs source String, for example "1,-1,-2,0"
   * @return a new comma separated list in vector form, for example "[0,-2,-1,1]"
   */
  private static String reverse(final String coeffs) {
    final StringBuilder result = new StringBuilder(256);
    final String[] rcoeffs = coeffs.replaceAll("[}\\]){\\[(\\s]", "").split(",");
    for (int icoeff = rcoeffs.length - 1; icoeff >= 0; --icoeff) {
        result.append(',');
        result.append(rcoeffs[icoeff]);
    } // for icoeff
    return "[" + result.substring(1) + "]";
  } // reverse(String)

  /**
   * Reverse <code>this</code> recurrence, that is
   * reverse the order of the polynomials and of the initial terms,
   * but do not change any sign.
   * @param holRec instance to be reversed
   * @param initSize number of initial terms to be kept (from the end)
   * @return a new HolonomicRecurrence which will run backwards
   */
  private static HolonomicRecurrence reverse(final HolonomicRecurrence holRec, final int initSize) {
    final ArrayList<Z[]> polyList = holRec.getPolyList();
    final ArrayList<Z[]> rPolyList = new ArrayList<>(16);
    rPolyList.add(polyList.get(0)); // the constant
    int ind;
    for (ind = polyList.size() - 1;  ind >= 1; --ind) { // polynomials
      rPolyList.add(polyList.get(ind));
    } // for ind - polynomials

    final Z[] initTerms = holRec.getInitTerms();
    final Z[] rInitTerms = new Z[initSize];
    int rind = 0;
    ind = initTerms.length - 1;
    while (ind >= 0 && rind < initSize) { // initial terms
      rInitTerms[rind++] = initTerms[ind--];
    } // while initial terms
    final HolonomicRecurrence rHolRec = new HolonomicRecurrence(holRec.getOffset(), rPolyList, rInitTerms, holRec.getDistance());
    rHolRec.setGfType(holRec.getGfType());
    return rHolRec;
  } // reverse(HolonomicRecurrence,int)

  /**
   * Reverse <code>this</code> recurrence, that is
   * reverse the order of the polynomials and of all initial terms,
   * but do not change any sign.
   * @param holRec instance to be reversed
   * @return a new HolonomicRecurrence which will run backwards
   */
  private static HolonomicRecurrence reverse(final HolonomicRecurrence holRec) {
    return reverse(holRec, holRec.getInitTerms().length);
  } // reverse(HolonomicRecurrence)

  /**
   * Gets a String representation of the coefficient polynomials.
   * @param holRec instance to be evaluated
   * @return a list of polynomials of the form "[[0,1],[1,2],[1]]".
   */
  private static String getPolyString(final HolonomicRecurrence holRec) {
    final StringBuilder result = new StringBuilder(256);
    final ArrayList<Z[]> polyList = holRec.getPolyList();
    result.append('[');
    for (int i = 0; i < polyList.size(); ++i) { // polynomials
      final Z[] poly = polyList.get(i);
      if (i > 0) {
        result.append(',');
      }
      result.append('[');
      for (int j = 0; j < poly.length; ++j) {
        if (j > 0) {
          result.append(',');
        }
        result.append(poly[j]);
      } // for j
      result.append(']');
    } // for i
    result.append(']');
    return result.toString();
  } // getPolyString(hr)

  /**
   * Gets a String representation of the initial terms.
   * @param holRec instance to be evaluated
   * @param offset1 starting index (first is 0)
   * @param len number of terms to be included
   * @return a list of terms of the form "[0,1,1,2,1]".
   */
  private static String xxGetInitString(final HolonomicRecurrence holRec, final int offset1, final int len) {
    final StringBuilder result = new StringBuilder(256);
    final Z[] initTerms = holRec.getInitTerms();
    result.append('[');
    for (int j = 0; j < len; ++j) {
      if (j > 0) {
        result.append(',');
      }
      result.append(initTerms[offset1 + j]);
      ++j;
    } // while j
    result.append(']');
    return result.toString();
  } // xxGetInitString(hr, int, int)

  /**
   * Gets a String representation
   * of the initial terms.
   * @param holRec instance to be evaluated
   * @param len number of terms to be included
   * @return a list of terms of the form "[0,1,1,2,1]".
   */
  private static String xxGetInitString(final HolonomicRecurrence holRec, final int len) {
    return xxGetInitString(holRec, 0, len);
  } // xxGetInitString(int)

  /**
   * Gets a String representation
   * of the initial terms.
   * @param holRec instance to be evaluated
   * @return a list of terms of the form "[0,1,1,2,1]".
   */
  private static String xxGetInitString(final HolonomicRecurrence holRec) {
    return xxGetInitString(holRec, 0, holRec.getInitTerms().length);
  } // xxGetInitString()

  /**
   * Evaluate a HolonomicRecurrence and gets a list
   * of the resulting data terms.
   * @param holRec instance to be evaluated
   * @param numTerms how many terms should be returned
   * @return a list of terms of the form "0,1,1,2,3,5,8".
   */
  private static String getDataList(final HolonomicRecurrence holRec, final int numTerms) {
    final StringBuilder result = new StringBuilder(256);
    int n = 0;
    boolean busy = true;
    while (n < numTerms && busy) {
      final Z term = holRec.next();
      if (term != null) {
        result.append(',');
        result.append(term);
      } else {
        result.append(",null");
        busy = false; // break loop
      }
      ++n;
    } // while n
    return result.substring(1); // without leading comma
  } // getDataList

  /**
   * Compute the initial terms of an ordinary (rational) generating function.
   * @param nums numerator   as a comma separated list
   * @param dens denominator as a comma separated list
   * @return a new comma separated list with the computed initial terms
   */
  public static String[] computeInitialTerms(final String nums, final String dens) {
    final Z[] pDen = ZUtils.toZ(dens);
    final int pDenLen = pDen.length;
    final Z[] temp = ZUtils.toZ(nums);
    int leadz = 0; // number of leading zeroes in nums
    while (leadz < temp.length && temp[leadz].equals(Z.ZERO)) {
      ++leadz;
    } // while leadz
    final int pNumLen = Math.max(pDenLen, temp.length + leadz); // pNumLen is always >= pDenLen
    if (sDebug >= 2) {
      System.out.println("# holgf1: nums=" + nums + ", dens=" + dens
          + ", pNumLen=" + pNumLen + ", pDenLen=" + pDenLen);
    }
    final Z[] pNum = new Z[pNumLen]; // accumulate new initial terms here
    for (int ind = 0; ind < pNumLen; ++ind) { // copy all coefficients (polynomials of degree 0)
      pNum[ind] = ind < temp.length ? temp[ind] : Z.ZERO;
    } // for ind - copy
    final String[] result = new String[pNumLen];

    final Z divisor = pDen[0];
    if (divisor.equals(Z.ZERO)) {
      throw new IllegalArgumentException("divisor is zero");
    }
    for (int inum = 0; inum < pNumLen; ++inum) { // compute new initial terms
      // similar code in GeneratingFunctionSequence.next()
      final Z[] quotRest = pNum[inum].divideAndRemainder(divisor);
      result[inum]   = quotRest[0].toString();
      final Z factor = quotRest[0].negate();
      if (! quotRest[1].equals(Z.ZERO)) {
        throw new IllegalArgumentException("no even division");
      }
      for (int iden = 0; iden < pDenLen; ++iden) {
        final int knum = inum + iden;
        if (knum < pNumLen) {
          pNum[knum] = pNum[knum].add(pDen[iden].multiply(factor));
        }
      } // for iden
      if (sDebug >= 2) {
        System.out.println("# holgf2: factor=" + factor
            + ", summand= " + pDen[0].multiply(factor)
            + ", pnum[" + inum + "]=" + pNum[inum]);
      }
    } // for inum - compute
    if (sDebug >= 1) {
      System.out.println("# " + "compute result=\"" + String.join(",", result) + "\"");
    }
    return result;
  } // computeInitialterms

  /**
   * Adjust initial terms such that the first term with abs() &gt;= 2
   * has count <code>offset2</code>, counted from 1.
   * @param terms initial terms as calculated from the generating function
   * @param offset2 index of first term with abs() &gt;= 2, counted from 1
   * @return comma separated list with the (maybe truncated) initial terms
   */
  public String adjustToOffset2(final String[] terms, int offset2) {
    if (offset2 == 1 && terms[0].matches("-?[01]")) {
      offset2 = 0;
    }
    final StringBuilder result = new StringBuilder(256);
    int count2 = 0; // count (starting from 1) of first term with abs() >= 2; 0 if not yet determined
    int iterm  = 0; // index of term to be investigated
    while (iterm < terms.length) {
      final String term = terms[iterm];
      // if (count2 == 0 && ! term.equals("0") && ! terms.equals("1") && ! term.equals("-1")) {
      if (count2 == 0 && ! term.matches("-?[01]")) {
        count2 = iterm + 1;
      }
      result.append(',');
      result.append(term);
      ++iterm;
    } // while iterm
    int start = 1; // skip over leading comma
    if (count2 == 0) { // cannot adjust
      count2 = offset2;
    }
    if (count2 > offset2) { // needs adjustment - remove count2 - offset2 leading zeroes
      int iadj = count2;
      while (iadj > offset2) {
        start = result.indexOf(",", start) + 1; // skip behind next comma
        --iadj;
      }
      if (sDebug >= 1) {
        System.out.println("# " + mAseqno + " adjust count2=" + count2 + " > offset2=" + offset2
            + ", start=" + start + ", result=\"" + result + "\"");
      }
    } else if (count2 < offset2) { // strange - some leading zeroes are missing?
      result.insert(0, ",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0"
          .substring(0, Math.min(64, (offset2 - count2) * 2)));
      if (sDebug >= 1) {
        System.out.println("# " + mAseqno + " adjust count2=" + count2 + " < offset2=" + offset2
            + ", start=" + start + ", result=\"" + result + "\"");
      }
    } // else equal, do nothing
    return result.substring(start);
  } // adjustToOffset2

  /**
   * Process one input line, and determine
   * whether it should be written to the output.
   * The following <code>callCode</code>s are processed:
   * <ul>
   * <li><code>holgf</code> - GeneratingFunction parameters -&gt; HolonomicRecurrence</li>
   * <li><code>holog</code> - determine the prefixed initial terms (new, with shorten)</li>
   * <li><code>holoh</code> - determine the prefixed initial terms (old version)</li>
   * <li><code>holop</code> - return the parameters of the sequence (below in {@link #processFile})<li>
   * <li><code>holor</code> - try to evaluate the recurrence backwards</li>
   * <li><code>holos</code> - evaluate the recurrence <code>numTerms</code> times</li>
   * </ul>
   * The following parameters are already consumed: <em>aseqno, callCode, offset</em>.
   */
  private void processRecord() {
    mInitString = ""; // initial terms for a(n)
    mPolyString = ""; // polynomials as coefficients of <code>n^i, i=0..m</code>
    // input record is: aseqno callCode offset1 polyList initTerms mNDist offset2 data
    mNDist = 0;
    int offset2 = 1;
    mIparm = 2;
    try {
      mOffset = Integer.parseInt(mParms[mIparm++]); // [2]
      mPolyString = mParms[mIparm++].replaceAll("[{(]", "[").replaceAll("[})]", "]");  // [3]
      mInitString = mParms[mIparm++].replaceAll("[{(]", "[").replaceAll("[})]", "]"); // [4]
      mNDist  = Integer.parseInt(mParms[mIparm++]); // [5]
      offset2 = Integer.parseInt(mParms[mIparm++]); // [6]
    } catch (final RuntimeException exc) {
      // ignore, take defaults
    }

    if (mCallCode.startsWith("holgf")) { // GeneratingFunction parameters -> HolonomicRecurrence
      // parameters are numerator, denominator polynomials
      final String temp = mPolyString;
      mPolyString = mInitString;
      mInitString = temp; // exchange both
      int iparm = 1;
      mParms[iparm++] = mCallCode + "1";
      mParms[iparm++] = String.valueOf(mOffset);
      mParms[iparm++] = reverse("[" + mPolyString + ",0]");
      final String[] terms  = computeInitialTerms(mInitString, mPolyString); // nums, dens
      mParms[iparm++] = "[" + adjustToOffset2(terms, offset2) + "]";
      mParms[iparm] = "0";
      reproduce();

    } else if (mCallCode.startsWith("holog")) { // determine the prefixed initial terms (new, with {@link shorten})
      mHolRec = new HolonomicRecurrence(mOffset, mPolyString, mInitString, mNDist); // instance to be tested
      mHolRec.setGfType(mGfType);
      final int shortened = mHolRec.shorten();
      if (shortened > 0) {
        mParms[4] = mHolRec.getInitString();
        System.out.println("# " + mAseqno + " " + mPolyString + " " + mInitString
            + " shortened by " + shortened +  " to " + mParms[4]);
      }
      reproduce();

    } else if (mCallCode.startsWith("holor")) { // getTermList(reverse)
      mHolRec = new HolonomicRecurrence(mOffset, mPolyString, mInitString, mNDist); // instance to be tested
      mHolRec.setGfType(mGfType);
      final HolonomicRecurrence rHolRec = reverse(mHolRec);
      mParms[3] = rHolRec.getPolyString();
      mParms[4] = rHolRec.getInitString();
      reproduce(6);
      System.out.println(mAseqno + "\t" + mCallCode + "1" + "\t" + mOffset + "\t" + getDataList(rHolRec, sNumTerms));
      System.out.println(mAseqno + "\t" + "========"); // will remain there even after sort

    } else if (mCallCode.startsWith("holos")) { // getTermList
      mHolRec = new HolonomicRecurrence(mOffset, mPolyString, mInitString, mNDist); // instance to be tested
      mHolRec.setGfType(mGfType);
      System.out.println(mAseqno + "\t" + mCallCode + "1" + "\t" + mOffset + "\t"
          + getDataList(mHolRec, sNumTerms) + "\t" + mPolyString);

    } else {
      reproduce();
      System.out.println(mAseqno + "\t" + "unknown callcode \"" + mCallCode + "\"");
    } // switch callCode
  } // processRecord

  /**
   * Reproduces the record with the (maybe modified) parameters.
   */
  protected void reproduce() {
    reproduce(mParms.length);
  } // reproduce

  /**
   * Reproduces part of the record with the (maybe modified) parameters.
   * @param num print only so many parameters.
   */
  protected void reproduce(final int num) {
    int j = 0;
    while (j < num && j < mParms.length) {
      System.out.print(j == 0 ? "" : "\t");
      System.out.print(mParms[j]);
      ++j;
    } // for j
    System.out.println();
  } // reproduce(int)

  /**
   * Gets the parameters if the sequence: offset, matrix, init, dist, gftype
   * and writes them into the record
   * @param aseqno A-number of the sequence
   */
  protected void getParameters(final String aseqno) {
    reproduce();
  } // reproduce(int)

  /**
   * Filters a file and writes the modified output lines.
   * @param fileName name of the input file, or "-" for STDIN
   */
  private void processFile(final String fileName) {
    final BufferedReader lineReader; // Reader for the input file
    final String srcEncoding = "UTF-8"; // Encoding of the input file
    try {
      if (fileName == null || fileName.length() <= 0 || fileName.equals("-")) {
        lineReader = new BufferedReader(new InputStreamReader(System.in, srcEncoding));
      } else {
        final ReadableByteChannel lineChannel = (new FileInputStream(fileName)).getChannel();
        lineReader = new BufferedReader(Channels.newReader(lineChannel , srcEncoding));
      }
      String line; // current line from text file
      while ((line = lineReader.readLine()) != null) { // read and process lines
        if (! line.matches("\\s*#.*")) { // is not a comment
          mParms = line.split("\\t", -1);
          if (sDebug >= 1) {
            System.out.println(line); // repeat it unchanged
          }
          mIparm = 0;
          mAseqno = mParms[mIparm++];
          mCallCode = mParms[mIparm++];
          try {
            mOffset = 0;
            mOffset = Integer.parseInt(mParms[mIparm++]);
          } catch (final RuntimeException exc) {
            // ignored
          }
          if (mCallCode.equals("holop")) {
            getParameters(mAseqno);
          } else {
            processRecord();
          }
        } // is not a comment
      } // while ! eof
      lineReader.close();
    } catch (final IOException exc) {
      System.err.println(exc.getMessage());
      exc.printStackTrace();
    } // try
  } // processFile

  /**
   * Main method, filters a file and writes the copy to STDOUT.
   * @param args command line arguments:
   * <ul>
   * <li>-b print in b-file format instead of comma separated list</li>
   * <li>-d level debugging level (default 0=none, 1=some, 2=more)</li>
   * <li>-f filename input file or "-" or none for STDIN</li>
   * <li>-i initTerms initial terms</li>
   * <li>-n numTerms number of terms to be computed (default: 16)</li>
   * <li>-p polyList list of vectors for coefficient polynomials in n</li>
   * <li>-t generating function type: 0 = ordinary, 1 = exponential</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int iarg = 0;
    final HolonomicRecurrenceTest holTest = new HolonomicRecurrenceTest();
    boolean bfile = false;
    sNumTerms = 16;
    holTest.mOffset  = 0;
    holTest.mGfType  = 0;
    int dist = 0;
    int incr = 1; // forwards
    String fileName  = "-"; // assume STDIN
    String polyList  = null;
    String initTerms = null;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        switch (opt) {
          case "-b":
            bfile = true;
            break;
          case "-d":
            sDebug = 0;
            sDebug = Integer.parseInt(args[iarg++]);
            HolonomicRecurrence.setDebug(sDebug);
            break;
          case "-dist":
            dist = Integer.parseInt(args[iarg++]);
            break;
          case "-f":
            fileName = args[iarg++];
            break;
          case "-i":
            initTerms = args[iarg++];
            break;
          case "-n":
            sNumTerms = Integer.parseInt(args[iarg++]);
            break;
          case "-o":
            holTest.mOffset = Integer.parseInt(args[iarg++]);
            break;
          case "-p":
            polyList = args[iarg++];
            break;
          case "-t":
            holTest.mGfType = Integer.parseInt(args[iarg++]);
            if ((holTest.mGfType & 4) == 4) {
              incr = -1; // backwards
            }
            break;
          default:
            System.err.println("??? invalid option: \"" + opt + "\"");
            break;
        }
      } catch (final RuntimeException exc) { // take default
        // ignored
      }
    } // while args
    if (polyList != null) {
      holTest.mHolRec = new HolonomicRecurrence(holTest.mOffset, polyList, initTerms, dist);
      holTest.mHolRec.setGfType(holTest.mGfType);
      if (! bfile) {
        System.out.println(getDataList(holTest.mHolRec, sNumTerms));
      } else {
        int ind = incr > 0 ? holTest.mOffset : holTest.mHolRec.getInitTerms().length - 1;
        boolean busy = true;
        while (busy && sNumTerms > 0) {
          final Z term = holTest.mHolRec.next();
          busy = term != null;
          if (busy) {
            System.out.println(ind + " " + term);
            --sNumTerms;
            ind = ind + incr;
          } 
        } // while 
      }
    } else {
      holTest.processFile(fileName);
    }
  } // main

} // HolonomicRecurrenceTest

