package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018339 Divisors of 220.
 * @author Sean A. Irvine
 */
public class A018339 extends FiniteSequence {

  /** Construct the sequence. */
  public A018339() {
    super(1, FINITE, Jaguar.factor(220).divisorsSorted());
  }
}
