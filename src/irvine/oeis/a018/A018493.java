package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018493 Divisors of 508.
 * @author Sean A. Irvine
 */
public class A018493 extends FiniteSequence {

  /** Construct the sequence. */
  public A018493() {
    super(Jaguar.factor(508).divisorsSorted());
  }
}
