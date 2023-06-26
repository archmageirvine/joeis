package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018523 Divisors of 568.
 * @author Sean A. Irvine
 */
public class A018523 extends FiniteSequence {

  /** Construct the sequence. */
  public A018523() {
    super(1, FINITE, Jaguar.factor(568).divisorsSorted());
  }
}
