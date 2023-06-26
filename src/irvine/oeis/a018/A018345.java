package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018345 Divisors of 231.
 * @author Sean A. Irvine
 */
public class A018345 extends FiniteSequence {

  /** Construct the sequence. */
  public A018345() {
    super(1, FINITE, Jaguar.factor(231).divisorsSorted());
  }
}
