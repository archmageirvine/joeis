package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018669 Divisors of 828.
 * @author Sean A. Irvine
 */
public class A018669 extends FiniteSequence {

  /** Construct the sequence. */
  public A018669() {
    super(1, FINITE, Jaguar.factor(828).divisorsSorted());
  }
}
