/* PowerSeries from Madore's python moonshine program
 * @(#) $Id$
 * 2020-10-02, Georg Fischer
 */
package irvine.math;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * An object class for doing simple operations on power
 * series (actually Laurent series: index is the valuation).
 * Derived from <code>moonshine.py</code> of
 * David A. Madore <david.madore@ens.fr> - 2007-07-31 - Public Domain
 * Cf. <a href="https://web.archive.org/web/20130925003421/http://mathforum.org/kb/thread.jspa?forumID=253&threadID=1602206&messageID=5836094">math forum</a>
 * @author Georg Fischer
 */
public class PowerSeries extends ArrayList<Z> {
  private int mIndex;
  //private static int sDebug = 0;

  /**
   * Empty constructor.
   */
  public PowerSeries() {
    mIndex = 0;
  }

  /**
   * Construct with index and {@link Z} coefficients
   * @param index current index
   * @param coeffs coefficients of the power series
   */
  public PowerSeries(final int index, final ArrayList<Z> coeffs) {
    mIndex = index;
    addAll(coeffs);
  }

  /**
   * Construct with index and String coefficient list
   * @param index current index
   * @param list coefficient list in the form "[1,2,99]"
   */
  public PowerSeries(final int index, final String list) {
    mIndex = index;
    final String[] elems = list.replaceAll("[^\\d\\-,]", "").split(",");
    for (final String elem : elems) {
      add(new Z(elem));
    } // for ic
  }

  /**
   * Return the current index
   * @return index
   */
  public int getIndex() {
    return mIndex;
  }

  /**
   * Return the (big-O) precision we have
   * @return precision
   */
  public int precis() {
    return mIndex + size();
  }

  /**
   * Multiply this series by another series.
   * @param s2 second series
   * @return product of series
   */
  public PowerSeries multiply(final PowerSeries s2) {
    final int index = this.mIndex + s2.mIndex;
    final int len1 = this.size();
    final int len2 = s2.size();
    final int len = Math.min(len1, len2);
    final ArrayList<Z> result = new ArrayList<Z>(32);
    for (int ic = 0; ic < len; ++ic) {
      Z sum = Z.ZERO;
      for (int jc = 0; jc <= ic; ++jc) {
        sum = sum.add(this.get(jc).multiply(s2.get(ic - jc)));
      } // for jc
      result.add(sum);
    } // for ic
    return new PowerSeries(index, result);
  } // multiply

  /**
   * Change a series by adding a monomial
   * @param c coefficient of the monomial to be added
   * @param k exponent
   */
  public void addMonomial(final Z c, final int k) {
    if (k < mIndex) {
      for (int ic = mIndex - k; ic > 0; --ic) {
        add(0, Z.ZERO);
      }
      mIndex = k;
    }
    set(k - mIndex, get(k - mIndex).add(c));
  } // addMonomial

  /**
   * Change a series by adding a monomial times a series
   * @param c coefficient of the monomial to be added
   * @param k exponent
   * @param f series to be multiplied with the monomial
   */
  public void addMonomialTimes(final Z c, final int k, final PowerSeries f) {
    if (k + f.precis() < mIndex) {
      System.err.println("defined nowhere, k=" + k);
    } else if (k + f.precis() < precis()) {
      removeRange(f.precis() - mIndex, size());
    }
    final int kfi = k + f.getIndex();
    if (kfi < mIndex) {
      for (int ic = mIndex - kfi; ic > 0; --ic) {
        add(0, Z.ZERO);
      }
      mIndex = kfi;
    }
    final int len = size();
    for (int ic = 0; ic < len; ++ic) {
      if (mIndex + ic >= kfi) {
        set(ic, get(ic).add(c.multiply(f.get(ic + mIndex - kfi))));
      }
    }
  } // addMonomialTimes

  /**
   * Return a given coefficient
   * @param k index (exponent) of the coefficient in the series
   * @return coefficient of exponent <code>k<</code>
   */
  public Z getCoeff(final int k) {
    Z result = Z.ZERO;
    if (k < mIndex) {
      // result = Z.ZERO;
    } else if (k < precis()) {
      result = get(k - mIndex);
    } else {
      System.err.println("insufficient precision, k=" + k);
    }
    return result;
  } // getCoeff

  /**
   * Return a representation of <code>this</code> PowerSeries
   * @return for example "[0,0,0,2,11];3"
   */
  public String toString() {
    final StringBuilder result = new StringBuilder(64);
    result.append('[');
    for (int ic = 0; ic < size(); ++ic) {
      if (ic > 0) {
        result.append(',');
      }
      result.append(get(ic));
    }
    result.append("];");
    result.append(mIndex);
    return result.toString();
  } // toString

//  /**
//   * Test method
//   * @param args command line arguments:
//   * <code>[-d debug] [-i initerms] [-m maxterms] [-p matrix]</code>
//   */
//  public static void main(String[] args) {
//    int maxTerms     = 16;
//    String matrix = "[[0],[1],[1],[-1]]"; // Fibonacci
//    String[] initTerms = { "[1,2]" };
//    PowerSeries ps = null;
//    if (args.length == 0) {
//    } else {
//      sDebug = 0;
//      int iarg = 0;
//      while (iarg < args.length) {
//        String opt = args[iarg++];
//        try {
//          if (false) {
//          } else if (opt.equals("-d")) {
//            sDebug  = Integer.parseInt(args[iarg++]);
//          } else if (opt.equals("-i")) {
//          } else if (opt.equals("-m")) {
//          } else if (opt.equals("-p")) {
//          }
//        } catch (Exception exc) {
//        }
//      } // while
//    }
//
//    PowerSeries s1 = new PowerSeries(0, "[0,0,1,3,0,0]");
//    System.out.println(s1);
//    PowerSeries s2 = new PowerSeries(0, "[0,2,5,0,0,0]");
//    System.out.println(s2);
//    PowerSeries s3 = s1.multiply(s2);
//    System.out.println(s3);
//
//    s3.addMonomial(Z.valueOf(17),2);
//    System.out.println(s3);
//    s3.addMonomialTimes(Z.valueOf(17),2,s1);
//    System.out.println(s3);
//
//    PowerSeries s4 = new PowerSeries(-1, "[1,0,196884,21493760,864299970,20245856256,333202640600]");
//    PowerSeries s5 = s4.multiply(s4);
//    System.out.println(s5);
//  } // main

}
