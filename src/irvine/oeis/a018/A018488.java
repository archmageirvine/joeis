package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018488 Divisors of 498.
 * @author Sean A. Irvine
 */
public class A018488 extends FiniteSequence {

  /** Construct the sequence. */
  public A018488() {
    super(Jaguar.factor(498).divisorsSorted());
  }
}
