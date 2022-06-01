package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110090 Numerators of sequence of rationals defined by r(n) = n for n&lt;=1 and for n&gt;1: r(n) = (sum of denominators of r(n-1) and r(n-2))/(sum of numerators of r(n-1) and r(n-2)).
 * @author Sean A. Irvine
 */
public class A110090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110090() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, 2, 1, 4});
  }
}
