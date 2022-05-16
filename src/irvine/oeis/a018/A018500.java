package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018500 Divisors of 524.
 * @author Sean A. Irvine
 */
public class A018500 extends FiniteSequence {

  /** Construct the sequence. */
  public A018500() {
    super(Jaguar.factor(524).divisorsSorted());
  }
}
