package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018671 Divisors of 832.
 * @author Sean A. Irvine
 */
public class A018671 extends FiniteSequence {

  /** Construct the sequence. */
  public A018671() {
    super(1, FINITE, Jaguar.factor(832).divisorsSorted());
  }
}
