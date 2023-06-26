package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018599 Divisors of 702.
 * @author Sean A. Irvine
 */
public class A018599 extends FiniteSequence {

  /** Construct the sequence. */
  public A018599() {
    super(1, FINITE, Jaguar.factor(702).divisorsSorted());
  }
}
