package irvine.oeis.a000;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A000352 One half of the number of permutations of [n] such that the differences have three runs with the same signs.
 * @author Sean A. Irvine
 */
public class A000352 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000352() {
    super(new long[] {5, -6},
      new long[] {1, -7, 17, -17, 6});
  }
}
