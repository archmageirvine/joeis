package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009891 Coordination sequence T2 for Zeolite Code RTE.
 * @author Sean A. Irvine
 */
public class A009891 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009891() {
    super(
      new long[] {1, 4, 10, 21, 32, 39, 43, 39, 28, 11, -11, -28, -39, -43, -39, -32, -21, -10, -4, -1},
      new int[] {3, 4, 5, 7});
  }
}

