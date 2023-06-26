package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018644 Divisors of 783.
 * @author Sean A. Irvine
 */
public class A018644 extends FiniteSequence {

  /** Construct the sequence. */
  public A018644() {
    super(1, FINITE, Jaguar.factor(783).divisorsSorted());
  }
}
