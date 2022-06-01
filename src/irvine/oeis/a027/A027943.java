package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027943 a(n) = T(2*n+1, n+3), T given by A027935.
 * @author Sean A. Irvine
 */
public class A027943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027943() {
    super(new long[] {1, -8, 26, -45, 45, -26, 8}, new long[] {1, 22, 155, 709, 2587, 8273, 24416});
  }
}
