package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018449 Divisors of 428.
 * @author Sean A. Irvine
 */
public class A018449 extends FiniteSequence {

  /** Construct the sequence. */
  public A018449() {
    super(1, FINITE, Jaguar.factor(428).divisorsSorted());
  }
}
