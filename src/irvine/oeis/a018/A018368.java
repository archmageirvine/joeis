package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018368 Divisors of 275.
 * @author Sean A. Irvine
 */
public class A018368 extends FiniteSequence {

  /** Construct the sequence. */
  public A018368() {
    super(Jaguar.factor(275).divisorsSorted());
  }
}
