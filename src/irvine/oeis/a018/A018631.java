package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018631 Divisors of 760.
 * @author Sean A. Irvine
 */
public class A018631 extends FiniteSequence {

  /** Construct the sequence. */
  public A018631() {
    super(1, FINITE, Jaguar.factor(760).divisorsSorted());
  }
}
