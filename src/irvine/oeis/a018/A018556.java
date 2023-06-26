package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018556 Divisors of 624.
 * @author Sean A. Irvine
 */
public class A018556 extends FiniteSequence {

  /** Construct the sequence. */
  public A018556() {
    super(1, FINITE, Jaguar.factor(624).divisorsSorted());
  }
}
