package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001360 Crystal ball sequence for hyperbolic tessellation <code>3^7 (from</code> triangle group <code>(2,3,7))</code>.
 * @author Sean A. Irvine
 */
public class A001360 extends LinearRecurrence {

  // Conjecture!

  /** Construct the sequence. */
  public A001360() {
    super(new long[] {1, -4, 4}, new long[] {1, 8, 29});
  }
}
