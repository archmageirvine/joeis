package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018577 Divisors of 658.
 * @author Sean A. Irvine
 */
public class A018577 extends FiniteSequence {

  /** Construct the sequence. */
  public A018577() {
    super(Jaguar.factor(658).divisorsSorted());
  }
}
