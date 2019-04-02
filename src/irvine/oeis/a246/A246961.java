package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246961 Numerator of the expected number of random moves in Tower of Hanoi problem with n disks starting at a randomly chosen valid configuration and ending with all disks at peg 1.
 * @author Sean A. Irvine
 */
public class A246961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246961() {
    super(new long[] {-2025, 1440, -342, 32}, new long[] {0, 4, 146, 3034});
  }
}
