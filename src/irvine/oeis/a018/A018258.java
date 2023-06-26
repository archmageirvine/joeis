package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018258 Divisors of 42.
 * @author Sean A. Irvine
 */
public class A018258 extends FiniteSequence {

  /** Construct the sequence. */
  public A018258() {
    super(1, FINITE, Jaguar.factor(42).divisorsSorted());
  }
}

