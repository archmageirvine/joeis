package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018594 Divisors of 690.
 * @author Sean A. Irvine
 */
public class A018594 extends FiniteSequence {

  /** Construct the sequence. */
  public A018594() {
    super(Jaguar.factor(690).divisorsSorted());
  }
}
