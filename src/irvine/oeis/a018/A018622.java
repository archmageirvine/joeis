package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018622 Divisors of 742.
 * @author Sean A. Irvine
 */
public class A018622 extends FiniteSequence {

  /** Construct the sequence. */
  public A018622() {
    super(1, FINITE, Jaguar.factor(742).divisorsSorted());
  }
}
