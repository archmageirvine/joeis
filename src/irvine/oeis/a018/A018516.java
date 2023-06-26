package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018516 Divisors of 555.
 * @author Sean A. Irvine
 */
public class A018516 extends FiniteSequence {

  /** Construct the sequence. */
  public A018516() {
    super(1, FINITE, Jaguar.factor(555).divisorsSorted());
  }
}
