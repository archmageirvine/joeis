/* Test class RationalRecurrence, determine init terms, run backwards
 * @(#) $Id$
 * 2025-06-11: Georg Fischer; ML=+106
 */
package irvine.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.oeis.recur.RationalRecurrence;

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
 * This class runs {@link RationalRecurrence}
 * <ul>
 * <li>with parameter lists read from a file,</li>
 * <li>for the determination of the necessary initial terms,</li>
 * <li>backwards to get a new sequence.</li>
 * </ul>
 * @author Georg Fischer
 */
public class RationalRecurrenceTest {
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
  private RationalRecurrence mHolRec;

  /**
   * Empty constructor.
   */
  protected RationalRecurrenceTest() {
    mHolRec = new RationalRecurrence(0, "[0,1,1,-1]" /* Fibonacci */, "[0,1]", 0);
    mGfType = 0; // ordinary
  }

  /**
   * Reverse a comma separated list of coefficients,
   * but do not change any sign.
   * @param coeffs source String, for example "1,-1,-2,0"
   * @return a new comma separated list in vector form, for example "[0,-2,-1,1]"
   */
  private static String reverse(final String coeffs) {
    final StringBuilder result = new StringBuilder(256);
    final String[] rcoeffs = coeffs.replaceAll("[}\\]){\\[(\\s]", "").split("\\,");
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
   * @return a new RationalRecurrence which will run backwards
   */
  private static RationalRecurrence reverse(final RationalRecurrence holRec, final int initSize) {
    final ArrayList<Q[]> polyList = holRec.getPolyList();
    final ArrayList<Q[]> rPolyList = new ArrayList<>(16);
    rPolyList.add(polyList.get(0)); // the constant
    int ind;
    for (ind = polyList.size() - 1;  ind >= 1; --ind) { // polynomials
      rPolyList.add(polyList.get(ind));
    } // for ind - polynomials

    final Q[] initTerms = holRec.getInitTerms();
    final Q[] rInitTerms = new Q[initSize];
    int rind = 0;
    ind = initTerms.length - 1;
    while (ind >= 0 && rind < initSize) { // initial terms
      rInitTerms[rind++] = initTerms[ind--];
    } // while initial terms
    final RationalRecurrence rHolRec = new RationalRecurrence(holRec.getOffset(), rPolyList, rInitTerms, holRec.getDistance());
    rHolRec.setGfType(holRec.getGfType());
    return rHolRec;
  } // reverse(RationalRecurrence,int)

  /**
   * Reverse <code>this</code> recurrence, that is
   * reverse the order of the polynomials and of all initial terms,
   * but do not change any sign.
   * @param holRec instance to be reversed
   * @return a new RationalRecurrence which will run backwards
   */
  private static RationalRecurrence reverse(final RationalRecurrence holRec) {
    return reverse(holRec, holRec.getInitTerms().length);
  } // reverse(RationalRecurrence)

  /**
   * Gets a String representation of the coefficient polynomials.
   * @param holRec instance to be evaluated
   * @return a list of polynomials of the form "[[0,1],[1,2],[1]]".
   */
  private static String getPolyString(final RationalRecurrence holRec) {
    final StringBuilder result = new StringBuilder(256);
    final ArrayList<Q[]> polyList = holRec.getPolyList();
    result.append('[');
    for (int i = 0; i < polyList.size(); ++i) { // polynomials
      final Q[] poly = polyList.get(i);
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
  private static String xxGetInitString(final RationalRecurrence holRec, final int offset1, final int len) {
    final StringBuilder result = new StringBuilder(256);
    final Q[] initTerms = holRec.getInitTerms();
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
  private static String xxGetInitString(final RationalRecurrence holRec, final int len) {
    return xxGetInitString(holRec, 0, len);
  } // xxGetInitString(int)

  /**
   * Gets a String representation
   * of the initial terms.
   * @param holRec instance to be evaluated
   * @return a list of terms of the form "[0,1,1,2,1]".
   */
  private static String xxGetInitString(final RationalRecurrence holRec) {
    return xxGetInitString(holRec, 0, holRec.getInitTerms().length);
  } // xxGetInitString()

  /**
   * Evaluate a RationalRecurrence and gets a list
   * of the resulting data terms.
   * @param holRec instance to be evaluated
   * @param numTerms how many terms should be returned
   * @return a list of terms of the form "0,1,1,2,3,5,8".
   */
  private static String getDataList(final RationalRecurrence holRec, final int numTerms) {
    final StringBuilder result = new StringBuilder(256);
    int n = 0;
    boolean busy = true;
    while (n < numTerms && busy) {
      final Q term = holRec.nextQ();
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
   * Process one input line, and determine
   * whether it should be written to the output.
   * The following <code>callCode</code>s are processed:
   * <ul>
   * <li><code>holgf</code> - GeneratingFunction parameters -&gt; RationalRecurrence</li>
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
    //int offset2 = 1;
    mIparm = 2;
    try {
      mOffset = Integer.parseInt(mParms[mIparm++]); // [2]
      mPolyString = mParms[mIparm++].replaceAll("[{(]", "[").replaceAll("[})]", "]");  // [3]
      mInitString = mParms[mIparm++].replaceAll("[{(]", "[").replaceAll("[})]", "]"); // [4]
      mNDist  = Integer.parseInt(mParms[mIparm++]); // [5]
      //offset2 = Integer.parseInt(mParms[mIparm++]); // [6]
    } catch (final RuntimeException exc) {
      // ignore, take defaults
    }

/*
    } else if (callCode.startsWith("holgf")) { // GeneratingFunction parameters -> RationalRecurrence
      // parameters are numerator, denominator polynomials
      String temp = mPolyString;
      mPolyString = mInitString;
      mInitString = temp; // exchange both
      int iparm = 1;
      parms[iparm ++] = callCode + "1";
      parms[iparm ++] = String.valueOf(mOffset);
      parms[iparm ++] = reverse("[" + mPolyString + ",0]");
      String[] terms  = computeInitialTerms(mInitString, mPolyString); // nums, dens
      parms[iparm ++] = "[" + adjustToOffset2(terms, offset2) + "]";
      parms[iparm ++] = "0";
      reproduce();

    } else if (callCode.startsWith("holog")) { // determine the prefixed initial terms (new, with {@link shorten})
      mHolRec = new RationalRecurrence(mOffset, mPolyString, mInitString, mNDist); // instance to be tested
      mHolRec.setGfType(mGfType);
      final int shortened = mHolRec.shorten();
      if (shortened > 0) {
        parms[4] = mHolRec.getInitString();
        System.out.println("# " + aseqno + " " + mPolyString + " " + mInitString
            + " shortened by " + shortened +  " to " + parms[4]);
      }
      reproduce();

    } else if (callCode.startsWith("holor")) { // getTermList(reverse)
      mHolRec = new RationalRecurrence(mOffset, mPolyString, mInitString, mNDist); // instance to be tested
      mHolRec.setGfType(mGfType);
      RationalRecurrence rHolRec = reverse(mHolRec);
      parms[3] = rHolRec.getPolyString();
      parms[4] = rHolRec.getInitString();
      reproduce(6);
      System.out.println(aseqno + "\t" + callCode + "1" + "\t" + mOffset + "\t" + getDataList(rHolRec, numTerms));
      System.out.println(aseqno + "\t" + "========"); // will remain there even after sort
*/
    if (mCallCode.startsWith("holos")) { // getTermList
      mHolRec = new RationalRecurrence(mOffset, mPolyString, mInitString, mNDist); // instance to be tested
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
   * Reproduces part of the the record with the (maybe modified) parameters.
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
   * <li>-t bitmask for generating function type: 0 or 1 = ordinary or exponential, 0 or 4 = rational or denominator</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int iarg = 0;
    final RationalRecurrenceTest holTest = new RationalRecurrenceTest();
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
            // RationalRecurrence.setDebug(sDebug);
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
      holTest.mHolRec = new RationalRecurrence(holTest.mOffset, polyList, initTerms, dist);
      holTest.mHolRec.setGfType(holTest.mGfType);
      int ind = incr > 0 ? holTest.mOffset : holTest.mHolRec.getInitTerms().length - 1;
      boolean busy = true;
      while (busy && sNumTerms > 0) {
        final Q term = holTest.mHolRec.nextQ();
        busy = term != null;
        if (busy) {
          if ((holTest.mGfType & 4) == 0) {
            if (bfile) {
              System.out.println(ind + " " + term.num());
            } else {
              System.out.print(", " + term); // rational, fraction
            }
          } else {
            if (bfile) {
              System.out.println(ind + " " + term.den());
            } else {
              System.out.print(", " + term.den());
            }
          }
          --sNumTerms;
          ind += incr;
        }
      } // while
    } else {
      holTest.processFile(fileName);
    }
  } // main

} // RationalRecurrenceTest

