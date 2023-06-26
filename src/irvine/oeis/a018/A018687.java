package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018687 Divisors of 858.
 * @author Sean A. Irvine
 */
public class A018687 extends FiniteSequence {

  /** Construct the sequence. */
  public A018687() {
    super(1, FINITE, Jaguar.factor(858).divisorsSorted());
  }
}
