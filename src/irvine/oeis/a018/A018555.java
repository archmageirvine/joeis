package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018555 Divisors of 621.
 * @author Sean A. Irvine
 */
public class A018555 extends FiniteSequence {

  /** Construct the sequence. */
  public A018555() {
    super(1, FINITE, Jaguar.factor(621).divisorsSorted());
  }
}
