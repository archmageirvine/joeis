package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018707 Divisors of 894.
 * @author Sean A. Irvine
 */
public class A018707 extends FiniteSequence {

  /** Construct the sequence. */
  public A018707() {
    super(1, FINITE, Jaguar.factor(894).divisorsSorted());
  }
}
