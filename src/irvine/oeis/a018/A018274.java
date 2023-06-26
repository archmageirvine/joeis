package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018274 Divisors of 78.
 * @author Sean A. Irvine
 */
public class A018274 extends FiniteSequence {

  /** Construct the sequence. */
  public A018274() {
    super(1, FINITE, Jaguar.factor(78).divisorsSorted());
  }
}
