package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018394 Divisors of 325.
 * @author Sean A. Irvine
 */
public class A018394 extends FiniteSequence {

  /** Construct the sequence. */
  public A018394() {
    super(Jaguar.factor(325).divisorsSorted());
  }
}
