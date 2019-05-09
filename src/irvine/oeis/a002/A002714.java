package irvine.oeis.a002;

import irvine.oeis.GeneratingFunctionSequence;


/**
 * A002714 Number of different keys with n cuts, depths between 1 and 7 and depth difference at most 1 between adjacent cut depths.
 * @author Sean A. Irvine
 */
public class A002714 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A002714() {
    super(new long[] {1, 3, -7, -5, 2}, new long[] {1, -4, 2, 4, -1});
  }
}
