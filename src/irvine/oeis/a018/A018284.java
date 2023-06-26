package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018284 Divisors of 102.
 * @author Sean A. Irvine
 */
public class A018284 extends FiniteSequence {

  /** Construct the sequence. */
  public A018284() {
    super(1, FINITE, Jaguar.factor(102).divisorsSorted());
  }
}
