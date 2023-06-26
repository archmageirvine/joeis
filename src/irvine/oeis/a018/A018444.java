package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018444 Divisors of 420.
 * @author Sean A. Irvine
 */
public class A018444 extends FiniteSequence {

  /** Construct the sequence. */
  public A018444() {
    super(1, FINITE, Jaguar.factor(420).divisorsSorted());
  }
}
