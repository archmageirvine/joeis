package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018688 Divisors of 860.
 * @author Sean A. Irvine
 */
public class A018688 extends FiniteSequence {

  /** Construct the sequence. */
  public A018688() {
    super(Jaguar.factor(860).divisorsSorted());
  }
}
