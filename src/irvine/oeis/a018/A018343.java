package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018343 Divisors of 228.
 * @author Sean A. Irvine
 */
public class A018343 extends FiniteSequence {

  /** Construct the sequence. */
  public A018343() {
    super(1, FINITE, Jaguar.factor(228).divisorsSorted());
  }
}
