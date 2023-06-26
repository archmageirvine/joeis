package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018663 Divisors of 819.
 * @author Sean A. Irvine
 */
public class A018663 extends FiniteSequence {

  /** Construct the sequence. */
  public A018663() {
    super(1, FINITE, Jaguar.factor(819).divisorsSorted());
  }
}
