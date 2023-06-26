package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018314 Divisors of 168.
 * @author Sean A. Irvine
 */
public class A018314 extends FiniteSequence {

  /** Construct the sequence. */
  public A018314() {
    super(1, FINITE, Jaguar.factor(168).divisorsSorted());
  }
}
