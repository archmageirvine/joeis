package irvine.oeis.a019;

import irvine.oeis.PartialSumSequence;

/**
 * A019445 Form a permutation of the positive integers, p_1, p_2, ..., such that the average of each initial segment is an integer, using the greedy algorithm to define p_n; sequence gives p_1+..+p_n.
 * @author Sean A. Irvine
 */
public class A019445 extends PartialSumSequence {

  /** Construct the sequence. */
  public A019445() {
    super(1, new A019444());
  }
}
