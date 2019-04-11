package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133766 <code>a(n) = (4*n+1)*(4*n+3)*(4*n+5)</code>.
 * @author Sean A. Irvine
 */
public class A133766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133766() {
    super(new long[] {-1, 4, -6, 4}, new long[] {15, 315, 1287, 3315});
  }
}
