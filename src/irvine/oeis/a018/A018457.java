package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018457 Divisors of 440.
 * @author Sean A. Irvine
 */
public class A018457 extends FiniteSequence {

  /** Construct the sequence. */
  public A018457() {
    super(1, FINITE, Jaguar.factor(440).divisorsSorted());
  }
}
