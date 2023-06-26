package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018780 Divisors of 1022.
 * @author Sean A. Irvine
 */
public class A018780 extends FiniteSequence {

  /** Construct the sequence. */
  public A018780() {
    super(1, FINITE, Jaguar.factor(1022).divisorsSorted());
  }
}
