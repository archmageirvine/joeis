package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018750 Divisors of 969.
 * @author Sean A. Irvine
 */
public class A018750 extends FiniteSequence {

  /** Construct the sequence. */
  public A018750() {
    super(1, FINITE, Jaguar.factor(969).divisorsSorted());
  }
}
