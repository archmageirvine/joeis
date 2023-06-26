package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018606 Divisors of 714.
 * @author Sean A. Irvine
 */
public class A018606 extends FiniteSequence {

  /** Construct the sequence. */
  public A018606() {
    super(1, FINITE, Jaguar.factor(714).divisorsSorted());
  }
}
