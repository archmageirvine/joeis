package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018733 Divisors of 940.
 * @author Sean A. Irvine
 */
public class A018733 extends FiniteSequence {

  /** Construct the sequence. */
  public A018733() {
    super(1, FINITE, Jaguar.factor(940).divisorsSorted());
  }
}
