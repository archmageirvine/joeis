package irvine.oeis.a016;

import irvine.oeis.CoordinationSequence;

/**
 * A016430 Coordination sequence <code>T1</code> for Zeolite Code OSI.
 * @author Sean A. Irvine
 */
public class A016430 extends CoordinationSequence {

  /** Construct the sequence. */
  public A016430() {
    super(
      new long[] {1, 4, 10, 20, 32, 43, 50, 50, 45, 40, 32, 18, 4, -5, -6, -2},
      new int[] {3, 4, 6});
  }
}
