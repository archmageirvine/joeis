package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018479 Divisors of 483.
 * @author Sean A. Irvine
 */
public class A018479 extends FiniteSequence {

  /** Construct the sequence. */
  public A018479() {
    super(1, FINITE, Jaguar.factor(483).divisorsSorted());
  }
}
