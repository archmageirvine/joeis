package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018391 Divisors of 320.
 * @author Sean A. Irvine
 */
public class A018391 extends FiniteSequence {

  /** Construct the sequence. */
  public A018391() {
    super(1, FINITE, Jaguar.factor(320).divisorsSorted());
  }
}
