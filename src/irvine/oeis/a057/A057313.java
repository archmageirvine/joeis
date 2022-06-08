package irvine.oeis.a057;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A057313 Coordination sequence T2 for Zeolite Code SAS.
 * @author Sean A. Irvine
 */
public class A057313 extends CoordinationSequence {

  /** Construct the sequence. */
  public A057313() {
    super(
      new long[] {1, 4, 9, 17, 30, 46, 59, 65, 66, 65, 59, 46, 30, 17, 9, 4, 1},
      new int[] {5, 5, 6});
  }
}
