package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018470 Divisors of 465.
 * @author Sean A. Irvine
 */
public class A018470 extends FiniteSequence {

  /** Construct the sequence. */
  public A018470() {
    super(1, FINITE, Jaguar.factor(465).divisorsSorted());
  }
}
