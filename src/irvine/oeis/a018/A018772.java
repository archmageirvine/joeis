package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018772 Divisors of 1008.
 * @author Sean A. Irvine
 */
public class A018772 extends FiniteSequence {

  /** Construct the sequence. */
  public A018772() {
    super(1, FINITE, Jaguar.factor(1008).divisorsSorted());
  }
}
