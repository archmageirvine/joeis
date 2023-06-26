package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018305 Divisors of 150.
 * @author Sean A. Irvine
 */
public class A018305 extends FiniteSequence {

  /** Construct the sequence. */
  public A018305() {
    super(1, FINITE, Jaguar.factor(150).divisorsSorted());
  }
}
