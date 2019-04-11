package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215053 <code>a(n) = 1/7*(</code> binomial(n,7) <code>- floor(n/7) )</code>.
 * @author Sean A. Irvine
 */
public class A215053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215053() {
    super(new long[] {-1, 7, -21, 35, -35, 21, -7, 2, -7, 21, -35, 35, -21, 7}, new long[] {1, 5, 17, 47, 113, 245, 490, 919, 1634, 2778, 4546, 7198, 11074, 16611});
  }
}
