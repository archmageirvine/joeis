package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018624 Divisors of 747.
 * @author Sean A. Irvine
 */
public class A018624 extends FiniteSequence {

  /** Construct the sequence. */
  public A018624() {
    super(1, FINITE, Jaguar.factor(747).divisorsSorted());
  }
}
