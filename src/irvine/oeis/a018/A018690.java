package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018690 Divisors of 864.
 * @author Sean A. Irvine
 */
public class A018690 extends FiniteSequence {

  /** Construct the sequence. */
  public A018690() {
    super(1, FINITE, Jaguar.factor(864).divisorsSorted());
  }
}
