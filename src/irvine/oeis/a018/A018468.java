package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018468 Divisors of 462.
 * @author Sean A. Irvine
 */
public class A018468 extends FiniteSequence {

  /** Construct the sequence. */
  public A018468() {
    super(1, FINITE, Jaguar.factor(462).divisorsSorted());
  }
}
