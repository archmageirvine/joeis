package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018565 Divisors of 640.
 * @author Sean A. Irvine
 */
public class A018565 extends FiniteSequence {

  /** Construct the sequence. */
  public A018565() {
    super(1, FINITE, Jaguar.factor(640).divisorsSorted());
  }
}
