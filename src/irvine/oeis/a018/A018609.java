package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018609 Divisors of 720.
 * @author Sean A. Irvine
 */
public class A018609 extends FiniteSequence {

  /** Construct the sequence. */
  public A018609() {
    super(1, FINITE, Jaguar.factor(720).divisorsSorted());
  }
}
