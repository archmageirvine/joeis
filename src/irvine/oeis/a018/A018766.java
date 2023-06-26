package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018766 Divisors of 999.
 * @author Sean A. Irvine
 */
public class A018766 extends FiniteSequence {

  /** Construct the sequence. */
  public A018766() {
    super(1, FINITE, Jaguar.factor(999).divisorsSorted());
  }
}
