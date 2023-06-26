package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018699 Divisors of 880.
 * @author Sean A. Irvine
 */
public class A018699 extends FiniteSequence {

  /** Construct the sequence. */
  public A018699() {
    super(1, FINITE, Jaguar.factor(880).divisorsSorted());
  }
}
