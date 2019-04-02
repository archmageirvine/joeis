package irvine.oeis.a033;

import irvine.oeis.CoordinationSequence;

/**
 * A033617 Coordination sequence T2 for Zeolite Code TSC.
 * @author Sean A. Irvine
 */
public class A033617 extends CoordinationSequence {

  /** Construct the sequence. */
  public A033617() {
    super(
      new long[] {1, 4, 9, 17, 28, 41, 56, 72, 89, 107, 124, 139, 149, 152, 149, 139, 124, 107, 89, 72, 56, 41, 28, 17, 9, 4, 1},
      new int[] {7, 9, 10});
  }
}
