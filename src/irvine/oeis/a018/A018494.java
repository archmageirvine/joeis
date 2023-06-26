package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018494 Divisors of 510.
 * @author Sean A. Irvine
 */
public class A018494 extends FiniteSequence {

  /** Construct the sequence. */
  public A018494() {
    super(1, FINITE, Jaguar.factor(510).divisorsSorted());
  }
}
