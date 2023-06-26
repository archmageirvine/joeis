package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018673 Divisors of 834.
 * @author Sean A. Irvine
 */
public class A018673 extends FiniteSequence {

  /** Construct the sequence. */
  public A018673() {
    super(1, FINITE, Jaguar.factor(834).divisorsSorted());
  }
}
