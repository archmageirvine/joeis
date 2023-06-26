package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018415 Divisors of 366.
 * @author Sean A. Irvine
 */
public class A018415 extends FiniteSequence {

  /** Construct the sequence. */
  public A018415() {
    super(1, FINITE, Jaguar.factor(366).divisorsSorted());
  }
}
