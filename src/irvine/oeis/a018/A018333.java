package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018333 Divisors of 204.
 * @author Sean A. Irvine
 */
public class A018333 extends FiniteSequence {

  /** Construct the sequence. */
  public A018333() {
    super(1, FINITE, Jaguar.factor(204).divisorsSorted());
  }
}
