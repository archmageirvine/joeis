package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018584 Divisors of 670.
 * @author Sean A. Irvine
 */
public class A018584 extends FiniteSequence {

  /** Construct the sequence. */
  public A018584() {
    super(1, FINITE, Jaguar.factor(670).divisorsSorted());
  }
}
