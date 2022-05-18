package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018461 Divisors of 448.
 * @author Sean A. Irvine
 */
public class A018461 extends FiniteSequence {

  /** Construct the sequence. */
  public A018461() {
    super(Jaguar.factor(448).divisorsSorted());
  }
}
