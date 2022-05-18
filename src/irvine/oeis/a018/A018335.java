package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018335 Divisors of 208.
 * @author Sean A. Irvine
 */
public class A018335 extends FiniteSequence {

  /** Construct the sequence. */
  public A018335() {
    super(Jaguar.factor(208).divisorsSorted());
  }
}
