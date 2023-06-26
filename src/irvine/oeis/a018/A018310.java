package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018310 Divisors of 160.
 * @author Sean A. Irvine
 */
public class A018310 extends FiniteSequence {

  /** Construct the sequence. */
  public A018310() {
    super(1, FINITE, Jaguar.factor(160).divisorsSorted());
  }
}
