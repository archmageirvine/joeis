package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018397 Divisors of 332.
 * @author Sean A. Irvine
 */
public class A018397 extends FiniteSequence {

  /** Construct the sequence. */
  public A018397() {
    super(1, FINITE, Jaguar.factor(332).divisorsSorted());
  }
}
