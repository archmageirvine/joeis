package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018765 Divisors of 996.
 * @author Sean A. Irvine
 */
public class A018765 extends FiniteSequence {

  /** Construct the sequence. */
  public A018765() {
    super(1, FINITE, Jaguar.factor(996).divisorsSorted());
  }
}
