package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018398 Divisors of 333.
 * @author Sean A. Irvine
 */
public class A018398 extends FiniteSequence {

  /** Construct the sequence. */
  public A018398() {
    super(1, FINITE, Jaguar.factor(333).divisorsSorted());
  }
}
