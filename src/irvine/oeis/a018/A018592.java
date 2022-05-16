package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018592 Divisors of 686.
 * @author Sean A. Irvine
 */
public class A018592 extends FiniteSequence {

  /** Construct the sequence. */
  public A018592() {
    super(Jaguar.factor(686).divisorsSorted());
  }
}
