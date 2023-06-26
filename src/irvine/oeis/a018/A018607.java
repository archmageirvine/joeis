package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018607 Divisors of 715.
 * @author Sean A. Irvine
 */
public class A018607 extends FiniteSequence {

  /** Construct the sequence. */
  public A018607() {
    super(1, FINITE, Jaguar.factor(715).divisorsSorted());
  }
}
