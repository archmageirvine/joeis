package irvine.oeis.a002;

import irvine.oeis.FiniteSequence;

/**
 * A002243 Numbers that are not the sum of 3 distinct triangular numbers.
 * @author Sean A. Irvine
 */
public class A002243 extends FiniteSequence {

  /** Construct the sequence. */
  public A002243() {
    super(1, 2, 3, 5, 6, 8, 12, 15, 20, 23, 33, 78);
  }
}

