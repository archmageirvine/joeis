package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018619 Divisors of 738.
 * @author Sean A. Irvine
 */
public class A018619 extends FiniteSequence {

  /** Construct the sequence. */
  public A018619() {
    super(1, FINITE, Jaguar.factor(738).divisorsSorted());
  }
}
