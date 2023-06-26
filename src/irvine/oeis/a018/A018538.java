package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018538 Divisors of 595.
 * @author Sean A. Irvine
 */
public class A018538 extends FiniteSequence {

  /** Construct the sequence. */
  public A018538() {
    super(1, FINITE, Jaguar.factor(595).divisorsSorted());
  }
}
