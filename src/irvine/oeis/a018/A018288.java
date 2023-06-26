package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018288 Divisors of 110.
 * @author Sean A. Irvine
 */
public class A018288 extends FiniteSequence {

  /** Construct the sequence. */
  public A018288() {
    super(1, FINITE, Jaguar.factor(110).divisorsSorted());
  }
}
