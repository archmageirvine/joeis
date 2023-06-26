package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018601 Divisors of 705.
 * @author Sean A. Irvine
 */
public class A018601 extends FiniteSequence {

  /** Construct the sequence. */
  public A018601() {
    super(1, FINITE, Jaguar.factor(705).divisorsSorted());
  }
}
