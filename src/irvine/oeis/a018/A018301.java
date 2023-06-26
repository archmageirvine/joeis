package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018301 Divisors of 140.
 * @author Sean A. Irvine
 */
public class A018301 extends FiniteSequence {

  /** Construct the sequence. */
  public A018301() {
    super(1, FINITE, Jaguar.factor(140).divisorsSorted());
  }
}
