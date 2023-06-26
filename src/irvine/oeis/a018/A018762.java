package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018762 Divisors of 990.
 * @author Sean A. Irvine
 */
public class A018762 extends FiniteSequence {

  /** Construct the sequence. */
  public A018762() {
    super(1, FINITE, Jaguar.factor(990).divisorsSorted());
  }
}
