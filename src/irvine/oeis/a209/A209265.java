package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209265 <code>a(n) = 1 + 2*n^2 + 3*n^3 + 4*n^4 +5*n^5 + 6*n^6 + 7*n^7</code>.
 * @author Sean A. Irvine
 */
public class A209265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209265() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 28, 1537, 21322, 145633, 659176, 2284273, 6565462});
  }
}
