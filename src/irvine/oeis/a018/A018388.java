package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018388 Divisors of 315.
 * @author Sean A. Irvine
 */
public class A018388 extends FiniteSequence {

  /** Construct the sequence. */
  public A018388() {
    super(1, FINITE, Jaguar.factor(315).divisorsSorted());
  }
}
