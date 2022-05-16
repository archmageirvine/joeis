package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018320 Divisors of 176.
 * @author Sean A. Irvine
 */
public class A018320 extends FiniteSequence {

  /** Construct the sequence. */
  public A018320() {
    super(Jaguar.factor(176).divisorsSorted());
  }
}
