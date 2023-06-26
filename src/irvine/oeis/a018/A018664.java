package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018664 Divisors of 820.
 * @author Sean A. Irvine
 */
public class A018664 extends FiniteSequence {

  /** Construct the sequence. */
  public A018664() {
    super(1, FINITE, Jaguar.factor(820).divisorsSorted());
  }
}
