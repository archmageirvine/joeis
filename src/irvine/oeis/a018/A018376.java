package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018376 Divisors of 288.
 * @author Sean A. Irvine
 */
public class A018376 extends FiniteSequence {

  /** Construct the sequence. */
  public A018376() {
    super(Jaguar.factor(288).divisorsSorted());
  }
}
