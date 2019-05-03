package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009917 Coordination sequence <code>T1</code> for Zeolite Code WEI.
 * @author Sean A. Irvine
 */
public class A009917 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009917() {
    super(
      new long[] {1, 4, 9, 16, 23, 29, 29, 18, 0, -16, -27, -31, -27, -20, -9, 0, 3, 2, -2, -2},
      new int[] {3, 3, 4, 6});
  }
}

