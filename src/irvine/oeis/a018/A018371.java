package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018371 Divisors of 280.
 * @author Sean A. Irvine
 */
public class A018371 extends FiniteSequence {

  /** Construct the sequence. */
  public A018371() {
    super(1, FINITE, Jaguar.factor(280).divisorsSorted());
  }
}
