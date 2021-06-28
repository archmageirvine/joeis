package irvine.oeis.a048;

import irvine.oeis.PositionSequence;

/**
 * A048627 Numbers m such that the maximal value of A001222(binomial(m,k)) and the central value A001222(A001405(m)) are identical.
 * @author Sean A. Irvine
 */
public class A048627 extends PositionSequence {

  /** Construct the sequence. */
  public A048627() {
    super(1, new A048622(), 0);
  }
}

