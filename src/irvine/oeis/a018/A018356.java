package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018356 Divisors of 250.
 * @author Sean A. Irvine
 */
public class A018356 extends FiniteSequence {

  /** Construct the sequence. */
  public A018356() {
    super(1, FINITE, Jaguar.factor(250).divisorsSorted());
  }
}
