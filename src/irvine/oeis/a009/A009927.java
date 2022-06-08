package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009927 Coordination sequence for Cr3Si, Si position.
 * @author Sean A. Irvine
 */
public class A009927 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009927() {
    super(
      new long[] {1, 12, 50, 118, 192, 220, 207, 68, -123, -236, -276, -166, -58, -8, 19, -8, -12},
      new int[] {3, 3, 4, 4});
  }
}
