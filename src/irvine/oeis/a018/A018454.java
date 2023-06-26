package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018454 Divisors of 435.
 * @author Sean A. Irvine
 */
public class A018454 extends FiniteSequence {

  /** Construct the sequence. */
  public A018454() {
    super(1, FINITE, Jaguar.factor(435).divisorsSorted());
  }
}
