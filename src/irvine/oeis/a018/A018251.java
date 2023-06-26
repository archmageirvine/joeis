package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018251 Divisors of 18.
 * @author Sean A. Irvine
 */
public class A018251 extends FiniteSequence {

  /** Construct the sequence. */
  public A018251() {
    super(1, FINITE, Jaguar.factor(18).divisorsSorted());
  }
}

