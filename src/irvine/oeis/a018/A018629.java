package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018629 Divisors of 756.
 * @author Sean A. Irvine
 */
public class A018629 extends FiniteSequence {

  /** Construct the sequence. */
  public A018629() {
    super(1, FINITE, Jaguar.factor(756).divisorsSorted());
  }
}
