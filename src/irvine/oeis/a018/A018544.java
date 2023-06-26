package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018544 Divisors of 604.
 * @author Sean A. Irvine
 */
public class A018544 extends FiniteSequence {

  /** Construct the sequence. */
  public A018544() {
    super(1, FINITE, Jaguar.factor(604).divisorsSorted());
  }
}
