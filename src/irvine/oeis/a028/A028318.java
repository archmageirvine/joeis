package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028318 Distinct elements in the 5-Pascal triangle A028313.
 * @author Sean A. Irvine
 */
public class A028318 extends DistinctSequence {

  /** Construct the sequence. */
  public A028318() {
    super(new A028313());
  }
}
