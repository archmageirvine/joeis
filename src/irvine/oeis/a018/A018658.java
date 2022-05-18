package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018658 Divisors of 808.
 * @author Sean A. Irvine
 */
public class A018658 extends FiniteSequence {

  /** Construct the sequence. */
  public A018658() {
    super(Jaguar.factor(808).divisorsSorted());
  }
}
