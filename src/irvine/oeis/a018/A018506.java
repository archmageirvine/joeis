package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018506 Divisors of 534.
 * @author Sean A. Irvine
 */
public class A018506 extends FiniteSequence {

  /** Construct the sequence. */
  public A018506() {
    super(1, FINITE, Jaguar.factor(534).divisorsSorted());
  }
}
