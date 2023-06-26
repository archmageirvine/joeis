package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018478 Divisors of 480.
 * @author Sean A. Irvine
 */
public class A018478 extends FiniteSequence {

  /** Construct the sequence. */
  public A018478() {
    super(1, FINITE, Jaguar.factor(480).divisorsSorted());
  }
}
