package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001360 Crystal ball sequence for hyperbolic tessellation 3^7 (from triangle group (2,3,7)).
 * @author Sean A. Irvine
 */
public class A001360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001360() {
    super(new long[] {1, -4, 4}, new long[] {1, 8, 29});
  }
}
