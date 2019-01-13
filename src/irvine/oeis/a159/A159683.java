package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159683.
 * @author Sean A. Irvine
 */
public class A159683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159683() {
    super(new long[] {1, -63, 63}, new long[] {0, 16, 1008});
  }
}
