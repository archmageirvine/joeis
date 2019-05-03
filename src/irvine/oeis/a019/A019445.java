package irvine.oeis.a019;

import irvine.oeis.PartialSumSequence;

/**
 * A019445 Form a permutation of the positive integers, <code>p_1, p_2</code>, ..., such that the average of each initial segment is an integer, using the greedy algorithm to define <code>p_n</code>; sequence gives <code>p_1+..+p_n</code>.
 * @author Sean A. Irvine
 */
public class A019445 extends PartialSumSequence {

  /** Construct the sequence. */
  public A019445() {
    super(new A019444());
  }
}
