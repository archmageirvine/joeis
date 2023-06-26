package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018734 Divisors of 942.
 * @author Sean A. Irvine
 */
public class A018734 extends FiniteSequence {

  /** Construct the sequence. */
  public A018734() {
    super(1, FINITE, Jaguar.factor(942).divisorsSorted());
  }
}
