package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018382 Divisors of 300.
 * @author Sean A. Irvine
 */
public class A018382 extends FiniteSequence {

  /** Construct the sequence. */
  public A018382() {
    super(1, FINITE, Jaguar.factor(300).divisorsSorted());
  }
}
