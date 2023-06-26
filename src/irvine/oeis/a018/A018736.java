package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018736 Divisors of 945.
 * @author Sean A. Irvine
 */
public class A018736 extends FiniteSequence {

  /** Construct the sequence. */
  public A018736() {
    super(1, FINITE, Jaguar.factor(945).divisorsSorted());
  }
}
