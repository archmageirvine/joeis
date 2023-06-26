package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018738 Divisors of 948.
 * @author Sean A. Irvine
 */
public class A018738 extends FiniteSequence {

  /** Construct the sequence. */
  public A018738() {
    super(1, FINITE, Jaguar.factor(948).divisorsSorted());
  }
}
