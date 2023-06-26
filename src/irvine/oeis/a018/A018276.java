package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018276 Divisors of 84.
 * @author Sean A. Irvine
 */
public class A018276 extends FiniteSequence {

  /** Construct the sequence. */
  public A018276() {
    super(1, FINITE, Jaguar.factor(84).divisorsSorted());
  }
}
