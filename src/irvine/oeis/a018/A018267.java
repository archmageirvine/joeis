package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018267 Divisors of 63.
 * @author Sean A. Irvine
 */
public class A018267 extends FiniteSequence {

  /** Construct the sequence. */
  public A018267() {
    super(Jaguar.factor(63).divisorsSorted());
  }
}

