package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018573 Divisors of 652.
 * @author Sean A. Irvine
 */
public class A018573 extends FiniteSequence {

  /** Construct the sequence. */
  public A018573() {
    super(1, FINITE, Jaguar.factor(652).divisorsSorted());
  }
}
