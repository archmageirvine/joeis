package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018693 Divisors of 870.
 * @author Sean A. Irvine
 */
public class A018693 extends FiniteSequence {

  /** Construct the sequence. */
  public A018693() {
    super(Jaguar.factor(870).divisorsSorted());
  }
}
