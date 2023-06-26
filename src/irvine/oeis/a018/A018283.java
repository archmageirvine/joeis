package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018283 Divisors of 100.
 * @author Sean A. Irvine
 */
public class A018283 extends FiniteSequence {

  /** Construct the sequence. */
  public A018283() {
    super(1, FINITE, Jaguar.factor(100).divisorsSorted());
  }
}
