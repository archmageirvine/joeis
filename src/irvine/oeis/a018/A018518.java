package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018518 Divisors of 558.
 * @author Sean A. Irvine
 */
public class A018518 extends FiniteSequence {

  /** Construct the sequence. */
  public A018518() {
    super(1, FINITE, Jaguar.factor(558).divisorsSorted());
  }
}
