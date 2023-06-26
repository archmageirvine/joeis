package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018416 Divisors of 368.
 * @author Sean A. Irvine
 */
public class A018416 extends FiniteSequence {

  /** Construct the sequence. */
  public A018416() {
    super(1, FINITE, Jaguar.factor(368).divisorsSorted());
  }
}
