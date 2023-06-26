package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018262 Divisors of 50.
 * @author Sean A. Irvine
 */
public class A018262 extends FiniteSequence {

  /** Construct the sequence. */
  public A018262() {
    super(1, FINITE, Jaguar.factor(50).divisorsSorted());
  }
}

