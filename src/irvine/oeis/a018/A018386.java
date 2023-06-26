package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018386 Divisors of 310.
 * @author Sean A. Irvine
 */
public class A018386 extends FiniteSequence {

  /** Construct the sequence. */
  public A018386() {
    super(1, FINITE, Jaguar.factor(310).divisorsSorted());
  }
}
