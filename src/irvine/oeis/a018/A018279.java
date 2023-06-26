package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018279 Divisors of 92.
 * @author Sean A. Irvine
 */
public class A018279 extends FiniteSequence {

  /** Construct the sequence. */
  public A018279() {
    super(1, FINITE, Jaguar.factor(92).divisorsSorted());
  }
}
