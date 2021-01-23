package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028378 Concatenate rows of triangle in A028364 (removing duplicates).
 * @author Sean A. Irvine
 */
public class A028378 extends DistinctSequence {

  /** Construct the sequence. */
  public A028378() {
    super(new A028376());
  }
}
