package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018327 Divisors of 190.
 * @author Sean A. Irvine
 */
public class A018327 extends FiniteSequence {

  /** Construct the sequence. */
  public A018327() {
    super(1, FINITE, Jaguar.factor(190).divisorsSorted());
  }
}
