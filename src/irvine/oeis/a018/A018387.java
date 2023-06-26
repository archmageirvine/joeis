package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018387 Divisors of 312.
 * @author Sean A. Irvine
 */
public class A018387 extends FiniteSequence {

  /** Construct the sequence. */
  public A018387() {
    super(1, FINITE, Jaguar.factor(312).divisorsSorted());
  }
}
