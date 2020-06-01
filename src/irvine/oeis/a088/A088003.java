package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088003 Take the list <code>t(n,0) = {1,...,n};</code> denote by <code>t(n,j)</code> this list after rotating to left (or right) by j positions. Calculate inner product of <code>t(n,0)</code> and <code>t(n,j)</code> and denote the value by <code>s(n,j)</code>. Compute this inner product for all j <code>= 1..n</code> and choose the smallest. This is <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A088003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088003() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 4, 11, 22, 40, 64});
  }
}
