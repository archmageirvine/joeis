package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110090 Numerators of sequence of rationals defined by <code>r(n) = n</code> for <code>n&lt;=1</code> and for <code>n&gt;1: r(n) =</code> (sum of denominators of <code>r(n-1)</code> and <code>r(n-2))/(sum</code> of numerators of <code>r(n-1)</code> and <code>r(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A110090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110090() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, 2, 1, 4});
  }
}
