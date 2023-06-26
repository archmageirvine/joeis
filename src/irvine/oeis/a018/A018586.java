package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018586 Divisors of 675.
 * @author Sean A. Irvine
 */
public class A018586 extends FiniteSequence {

  /** Construct the sequence. */
  public A018586() {
    super(1, FINITE, Jaguar.factor(675).divisorsSorted());
  }
}
