package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018315 Divisors of 170.
 * @author Sean A. Irvine
 */
public class A018315 extends FiniteSequence {

  /** Construct the sequence. */
  public A018315() {
    super(1, FINITE, Jaguar.factor(170).divisorsSorted());
  }
}
