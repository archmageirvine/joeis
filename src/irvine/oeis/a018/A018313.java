package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018313 Divisors of 165.
 * @author Sean A. Irvine
 */
public class A018313 extends FiniteSequence {

  /** Construct the sequence. */
  public A018313() {
    super(1, FINITE, Jaguar.factor(165).divisorsSorted());
  }
}
