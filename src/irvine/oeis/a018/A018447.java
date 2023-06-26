package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018447 Divisors of 425.
 * @author Sean A. Irvine
 */
public class A018447 extends FiniteSequence {

  /** Construct the sequence. */
  public A018447() {
    super(1, FINITE, Jaguar.factor(425).divisorsSorted());
  }
}
