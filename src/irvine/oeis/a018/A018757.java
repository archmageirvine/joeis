package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018757 Divisors of 981.
 * @author Sean A. Irvine
 */
public class A018757 extends FiniteSequence {

  /** Construct the sequence. */
  public A018757() {
    super(1, FINITE, Jaguar.factor(981).divisorsSorted());
  }
}
