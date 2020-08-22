package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277228 Convolution of the even-indexed triangular numbers (A014105) and the squares (A000290).
 * @author Sean A. Irvine
 */
public class A277228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277228() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 3, 22, 88, 258});
  }
}
