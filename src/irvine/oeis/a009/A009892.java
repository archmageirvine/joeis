package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009892 Coordination sequence <code>T3</code> for Zeolite Code RTE.
 * @author Sean A. Irvine
 */
public class A009892 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009892() {
    super(
      new long[] {1, 4, 11, 20, 30, 41, 44, 39, 27, 9, -9, -27, -39, -44, -41, -30, -20, -11, -4, -1},
      new int[] {3, 4, 5, 7});
  }
}

