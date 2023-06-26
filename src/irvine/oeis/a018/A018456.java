package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018456 Divisors of 438.
 * @author Sean A. Irvine
 */
public class A018456 extends FiniteSequence {

  /** Construct the sequence. */
  public A018456() {
    super(1, FINITE, Jaguar.factor(438).divisorsSorted());
  }
}
