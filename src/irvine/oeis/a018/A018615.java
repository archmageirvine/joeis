package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018615 Divisors of 730.
 * @author Sean A. Irvine
 */
public class A018615 extends FiniteSequence {

  /** Construct the sequence. */
  public A018615() {
    super(Jaguar.factor(730).divisorsSorted());
  }
}
