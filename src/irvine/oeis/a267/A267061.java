package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267061 Coefficient of <code>x^2</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(2)+sqrt(3),1,1,...],</code> where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A267061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267061() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {-50, 2498, 173262, 7783550, 376636138, 17527857350L, 826628182158L, 38778106729442L, 1822757247598510L});
  }
}
