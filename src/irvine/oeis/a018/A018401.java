package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018401 Divisors of 340.
 * @author Sean A. Irvine
 */
public class A018401 extends FiniteSequence {

  /** Construct the sequence. */
  public A018401() {
    super(Jaguar.factor(340).divisorsSorted());
  }
}
