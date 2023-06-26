package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018455 Divisors of 436.
 * @author Sean A. Irvine
 */
public class A018455 extends FiniteSequence {

  /** Construct the sequence. */
  public A018455() {
    super(1, FINITE, Jaguar.factor(436).divisorsSorted());
  }
}
