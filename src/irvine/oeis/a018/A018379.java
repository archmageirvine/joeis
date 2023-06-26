package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018379 Divisors of 294.
 * @author Sean A. Irvine
 */
public class A018379 extends FiniteSequence {

  /** Construct the sequence. */
  public A018379() {
    super(1, FINITE, Jaguar.factor(294).divisorsSorted());
  }
}
