package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018281 Divisors of 98.
 * @author Sean A. Irvine
 */
public class A018281 extends FiniteSequence {

  /** Construct the sequence. */
  public A018281() {
    super(1, FINITE, Jaguar.factor(98).divisorsSorted());
  }
}
