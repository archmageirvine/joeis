package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018743 Divisors of 957.
 * @author Sean A. Irvine
 */
public class A018743 extends FiniteSequence {

  /** Construct the sequence. */
  public A018743() {
    super(1, FINITE, Jaguar.factor(957).divisorsSorted());
  }
}
