package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018311 Divisors of 162.
 * @author Sean A. Irvine
 */
public class A018311 extends FiniteSequence {

  /** Construct the sequence. */
  public A018311() {
    super(Jaguar.factor(162).divisorsSorted());
  }
}
