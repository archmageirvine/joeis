package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018539 Divisors of 596.
 * @author Sean A. Irvine
 */
public class A018539 extends FiniteSequence {

  /** Construct the sequence. */
  public A018539() {
    super(1, FINITE, Jaguar.factor(596).divisorsSorted());
  }
}
