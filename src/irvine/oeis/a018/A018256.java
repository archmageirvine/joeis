package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018256 Divisors of 36.
 * @author Sean A. Irvine
 */
public class A018256 extends FiniteSequence {

  /** Construct the sequence. */
  public A018256() {
    super(1, FINITE, Jaguar.factor(36).divisorsSorted());
  }
}

