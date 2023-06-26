package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018702 Divisors of 885.
 * @author Sean A. Irvine
 */
public class A018702 extends FiniteSequence {

  /** Construct the sequence. */
  public A018702() {
    super(1, FINITE, Jaguar.factor(885).divisorsSorted());
  }
}
