package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018653 Divisors of 800.
 * @author Sean A. Irvine
 */
public class A018653 extends FiniteSequence {

  /** Construct the sequence. */
  public A018653() {
    super(1, FINITE, Jaguar.factor(800).divisorsSorted());
  }
}
