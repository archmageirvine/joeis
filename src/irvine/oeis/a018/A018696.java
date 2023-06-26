package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018696 Divisors of 874.
 * @author Sean A. Irvine
 */
public class A018696 extends FiniteSequence {

  /** Construct the sequence. */
  public A018696() {
    super(1, FINITE, Jaguar.factor(874).divisorsSorted());
  }
}
