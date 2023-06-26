package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018686 Divisors of 856.
 * @author Sean A. Irvine
 */
public class A018686 extends FiniteSequence {

  /** Construct the sequence. */
  public A018686() {
    super(1, FINITE, Jaguar.factor(856).divisorsSorted());
  }
}
