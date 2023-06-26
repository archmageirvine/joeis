package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018562 Divisors of 637.
 * @author Sean A. Irvine
 */
public class A018562 extends FiniteSequence {

  /** Construct the sequence. */
  public A018562() {
    super(1, FINITE, Jaguar.factor(637).divisorsSorted());
  }
}
