package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018771 Divisors of 1005.
 * @author Sean A. Irvine
 */
public class A018771 extends FiniteSequence {

  /** Construct the sequence. */
  public A018771() {
    super(1, FINITE, Jaguar.factor(1005).divisorsSorted());
  }
}
