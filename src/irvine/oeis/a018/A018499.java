package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018499 Divisors of 522.
 * @author Sean A. Irvine
 */
public class A018499 extends FiniteSequence {

  /** Construct the sequence. */
  public A018499() {
    super(1, FINITE, Jaguar.factor(522).divisorsSorted());
  }
}
