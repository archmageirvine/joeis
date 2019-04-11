package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168061 Denominator of <code>(n+3) / ((n+2) * (n+1) * n)</code>.
 * @author Sean A. Irvine
 */
public class A168061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168061() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0}, new long[] {3, 24, 10, 120, 105, 112, 252, 720, 165, 1320, 858, 728, 1365, 3360, 680, 4896, 2907, 2280, 3990, 9240, 1771, 12144, 6900, 5200});
  }
}
