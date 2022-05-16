package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018426 Divisors of 385.
 * @author Sean A. Irvine
 */
public class A018426 extends FiniteSequence {

  /** Construct the sequence. */
  public A018426() {
    super(Jaguar.factor(385).divisorsSorted());
  }
}
