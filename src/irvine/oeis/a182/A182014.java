package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182014 Number of independent sets of nodes in graph C_7 x P_n (n&gt;=0).
 * @author Sean A. Irvine
 */
public class A182014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182014() {
    super(new long[] {1, 5, -44, 8, 17}, new long[] {1, 29, 477, 8303, 143697});
  }
}
