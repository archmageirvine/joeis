package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181961 Number of independent sets of nodes in graph C_6 x P_n (n&gt;=0).
 * @author Sean A. Irvine
 */
public class A181961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181961() {
    super(new long[] {1, -2, -25, -3, 12}, new long[] {1, 18, 199, 2309, 26660});
  }
}
