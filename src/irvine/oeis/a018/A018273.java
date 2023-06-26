package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018273 Divisors of 76.
 * @author Sean A. Irvine
 */
public class A018273 extends FiniteSequence {

  /** Construct the sequence. */
  public A018273() {
    super(1, FINITE, Jaguar.factor(76).divisorsSorted());
  }
}
