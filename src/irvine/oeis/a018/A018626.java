package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018626 Divisors of 750.
 * @author Sean A. Irvine
 */
public class A018626 extends FiniteSequence {

  /** Construct the sequence. */
  public A018626() {
    super(1, FINITE, Jaguar.factor(750).divisorsSorted());
  }
}
