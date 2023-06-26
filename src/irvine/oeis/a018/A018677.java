package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018677 Divisors of 844.
 * @author Sean A. Irvine
 */
public class A018677 extends FiniteSequence {

  /** Construct the sequence. */
  public A018677() {
    super(1, FINITE, Jaguar.factor(844).divisorsSorted());
  }
}
