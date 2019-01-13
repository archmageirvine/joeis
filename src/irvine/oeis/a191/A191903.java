package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191903.
 * @author Sean A. Irvine
 */
public class A191903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191903() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 8, 40, 128, 312, 648});
  }
}
