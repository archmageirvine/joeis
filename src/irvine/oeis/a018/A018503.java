package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018503 Divisors of 530.
 * @author Sean A. Irvine
 */
public class A018503 extends FiniteSequence {

  /** Construct the sequence. */
  public A018503() {
    super(1, FINITE, Jaguar.factor(530).divisorsSorted());
  }
}
