package irvine.oeis.a016;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A016431 Coordination sequence T2 for Zeolite Code OSI.
 * @author Sean A. Irvine
 */
public class A016431 extends CoordinationSequence {

  /** Construct the sequence. */
  public A016431() {
    super(
      new long[] {1, 4, 11, 22, 34, 52, 82, 112, 125, 128, 130, 128, 116, 82, 23, -46, -100, -136, -153, -154, -154, -136, -92, -46, -21, -10, 0, 4, 4, 2, -1, -4, -5, -2},
      new int[] {6, 6, 8, 8});
  }
}
