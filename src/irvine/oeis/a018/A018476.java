package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018476 Divisors of 476.
 * @author Sean A. Irvine
 */
public class A018476 extends FiniteSequence {

  /** Construct the sequence. */
  public A018476() {
    super(Jaguar.factor(476).divisorsSorted());
  }
}
