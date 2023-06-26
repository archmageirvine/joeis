package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018645 Divisors of 784.
 * @author Sean A. Irvine
 */
public class A018645 extends FiniteSequence {

  /** Construct the sequence. */
  public A018645() {
    super(1, FINITE, Jaguar.factor(784).divisorsSorted());
  }
}
