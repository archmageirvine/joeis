package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018291 Divisors of 116.
 * @author Sean A. Irvine
 */
public class A018291 extends FiniteSequence {

  /** Construct the sequence. */
  public A018291() {
    super(1, FINITE, Jaguar.factor(116).divisorsSorted());
  }
}
