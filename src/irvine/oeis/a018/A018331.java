package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018331 Divisors of 198.
 * @author Sean A. Irvine
 */
public class A018331 extends FiniteSequence {

  /** Construct the sequence. */
  public A018331() {
    super(1, FINITE, Jaguar.factor(198).divisorsSorted());
  }
}
