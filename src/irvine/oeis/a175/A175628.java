package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175628 a(2*n+1) = A005563(n). a(2*n) = A061037(n+1).
 * @author Sean A. Irvine
 */
public class A175628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175628() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 3, 5, 8, 3, 15, 21, 24, 2, 35, 45, 48, 15, 63, 77, 80, 6, 99, 117, 120, 35, 143, 165});
  }
}
