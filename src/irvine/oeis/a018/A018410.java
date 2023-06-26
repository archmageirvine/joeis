package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018410 Divisors of 356.
 * @author Sean A. Irvine
 */
public class A018410 extends FiniteSequence {

  /** Construct the sequence. */
  public A018410() {
    super(1, FINITE, Jaguar.factor(356).divisorsSorted());
  }
}
