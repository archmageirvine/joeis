package irvine.oeis.a179;

import irvine.oeis.FiniteSequence;

/**
 * A179895 a(n) = smallest number m such that m^2 has exactly n decimal digits n.
 * @author Georg Fischer
 */
public class A179895 extends FiniteSequence {

  /** Construct the sequence. */
  public A179895() {
    super(1, 1, 15, 586, 212, 22485, 68313, 278874, 623609, 3082207);
  }
}
