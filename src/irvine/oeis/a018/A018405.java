package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018405 Divisors of 348.
 * @author Sean A. Irvine
 */
public class A018405 extends FiniteSequence {

  /** Construct the sequence. */
  public A018405() {
    super(1, FINITE, Jaguar.factor(348).divisorsSorted());
  }
}
