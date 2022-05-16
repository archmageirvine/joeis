package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018596 Divisors of 693.
 * @author Sean A. Irvine
 */
public class A018596 extends FiniteSequence {

  /** Construct the sequence. */
  public A018596() {
    super(Jaguar.factor(693).divisorsSorted());
  }
}
