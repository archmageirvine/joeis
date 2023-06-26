package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018777 Divisors of 1016.
 * @author Sean A. Irvine
 */
public class A018777 extends FiniteSequence {

  /** Construct the sequence. */
  public A018777() {
    super(1, FINITE, Jaguar.factor(1016).divisorsSorted());
  }
}
