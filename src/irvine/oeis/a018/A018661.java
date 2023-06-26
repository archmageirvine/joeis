package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018661 Divisors of 814.
 * @author Sean A. Irvine
 */
public class A018661 extends FiniteSequence {

  /** Construct the sequence. */
  public A018661() {
    super(1, FINITE, Jaguar.factor(814).divisorsSorted());
  }
}
