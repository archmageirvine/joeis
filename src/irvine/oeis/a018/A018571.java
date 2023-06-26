package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018571 Divisors of 650.
 * @author Sean A. Irvine
 */
public class A018571 extends FiniteSequence {

  /** Construct the sequence. */
  public A018571() {
    super(1, FINITE, Jaguar.factor(650).divisorsSorted());
  }
}
