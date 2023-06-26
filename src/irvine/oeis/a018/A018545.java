package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018545 Divisors of 605.
 * @author Sean A. Irvine
 */
public class A018545 extends FiniteSequence {

  /** Construct the sequence. */
  public A018545() {
    super(1, FINITE, Jaguar.factor(605).divisorsSorted());
  }
}
