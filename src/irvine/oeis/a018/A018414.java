package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018414 Divisors of 364.
 * @author Sean A. Irvine
 */
public class A018414 extends FiniteSequence {

  /** Construct the sequence. */
  public A018414() {
    super(1, FINITE, Jaguar.factor(364).divisorsSorted());
  }
}
