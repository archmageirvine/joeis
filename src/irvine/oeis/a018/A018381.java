package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018381 Divisors of 297.
 * @author Sean A. Irvine
 */
public class A018381 extends FiniteSequence {

  /** Construct the sequence. */
  public A018381() {
    super(Jaguar.factor(297).divisorsSorted());
  }
}
