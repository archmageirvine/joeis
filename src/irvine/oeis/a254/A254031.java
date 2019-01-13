package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254031.
 * @author Sean A. Irvine
 */
public class A254031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254031() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {15, 35, 105, 371, 1449});
  }
}
