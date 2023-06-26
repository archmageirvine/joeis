package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018628 Divisors of 754.
 * @author Sean A. Irvine
 */
public class A018628 extends FiniteSequence {

  /** Construct the sequence. */
  public A018628() {
    super(1, FINITE, Jaguar.factor(754).divisorsSorted());
  }
}
