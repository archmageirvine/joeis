package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018431 Divisors of 396.
 * @author Sean A. Irvine
 */
public class A018431 extends FiniteSequence {

  /** Construct the sequence. */
  public A018431() {
    super(Jaguar.factor(396).divisorsSorted());
  }
}
