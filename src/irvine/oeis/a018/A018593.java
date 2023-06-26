package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018593 Divisors of 688.
 * @author Sean A. Irvine
 */
public class A018593 extends FiniteSequence {

  /** Construct the sequence. */
  public A018593() {
    super(1, FINITE, Jaguar.factor(688).divisorsSorted());
  }
}
