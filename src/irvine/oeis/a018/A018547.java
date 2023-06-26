package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018547 Divisors of 608.
 * @author Sean A. Irvine
 */
public class A018547 extends FiniteSequence {

  /** Construct the sequence. */
  public A018547() {
    super(1, FINITE, Jaguar.factor(608).divisorsSorted());
  }
}
