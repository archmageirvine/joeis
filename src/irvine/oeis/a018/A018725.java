package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018725 Divisors of 927.
 * @author Sean A. Irvine
 */
public class A018725 extends FiniteSequence {

  /** Construct the sequence. */
  public A018725() {
    super(1, FINITE, Jaguar.factor(927).divisorsSorted());
  }
}
