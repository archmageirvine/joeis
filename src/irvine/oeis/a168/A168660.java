package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168660.
 * @author Sean A. Irvine
 */
public class A168660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168660() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 576, 30618, 532480, 4921875, 30373056, 141649396, 537919488, 1745783685, 5005000000L});
  }
}
