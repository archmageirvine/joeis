package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018498 Divisors of 520.
 * @author Sean A. Irvine
 */
public class A018498 extends FiniteSequence {

  /** Construct the sequence. */
  public A018498() {
    super(1, FINITE, Jaguar.factor(520).divisorsSorted());
  }
}
