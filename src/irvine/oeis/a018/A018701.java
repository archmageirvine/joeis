package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018701 Divisors of 884.
 * @author Sean A. Irvine
 */
public class A018701 extends FiniteSequence {

  /** Construct the sequence. */
  public A018701() {
    super(1, FINITE, Jaguar.factor(884).divisorsSorted());
  }
}
