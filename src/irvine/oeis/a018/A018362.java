package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018362 Divisors of 264.
 * @author Sean A. Irvine
 */
public class A018362 extends FiniteSequence {

  /** Construct the sequence. */
  public A018362() {
    super(1, FINITE, Jaguar.factor(264).divisorsSorted());
  }
}
