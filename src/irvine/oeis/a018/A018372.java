package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018372 Divisors of 282.
 * @author Sean A. Irvine
 */
public class A018372 extends FiniteSequence {

  /** Construct the sequence. */
  public A018372() {
    super(1, FINITE, Jaguar.factor(282).divisorsSorted());
  }
}
