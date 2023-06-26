package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018466 Divisors of 459.
 * @author Sean A. Irvine
 */
public class A018466 extends FiniteSequence {

  /** Construct the sequence. */
  public A018466() {
    super(1, FINITE, Jaguar.factor(459).divisorsSorted());
  }
}
