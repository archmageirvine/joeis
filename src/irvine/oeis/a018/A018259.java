package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018259 Divisors of 44.
 * @author Sean A. Irvine
 */
public class A018259 extends FiniteSequence {

  /** Construct the sequence. */
  public A018259() {
    super(1, FINITE, Jaguar.factor(44).divisorsSorted());
  }
}

