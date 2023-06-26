package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018610 Divisors of 722.
 * @author Sean A. Irvine
 */
public class A018610 extends FiniteSequence {

  /** Construct the sequence. */
  public A018610() {
    super(1, FINITE, Jaguar.factor(722).divisorsSorted());
  }
}
