package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018522 Divisors of 567.
 * @author Sean A. Irvine
 */
public class A018522 extends FiniteSequence {

  /** Construct the sequence. */
  public A018522() {
    super(1, FINITE, Jaguar.factor(567).divisorsSorted());
  }
}
