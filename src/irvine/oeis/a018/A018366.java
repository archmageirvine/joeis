package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018366 Divisors of 272.
 * @author Sean A. Irvine
 */
public class A018366 extends FiniteSequence {

  /** Construct the sequence. */
  public A018366() {
    super(1, FINITE, Jaguar.factor(272).divisorsSorted());
  }
}
