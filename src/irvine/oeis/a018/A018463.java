package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018463 Divisors of 452.
 * @author Sean A. Irvine
 */
public class A018463 extends FiniteSequence {

  /** Construct the sequence. */
  public A018463() {
    super(1, FINITE, Jaguar.factor(452).divisorsSorted());
  }
}
