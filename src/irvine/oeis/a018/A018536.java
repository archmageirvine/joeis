package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018536 Divisors of 592.
 * @author Sean A. Irvine
 */
public class A018536 extends FiniteSequence {

  /** Construct the sequence. */
  public A018536() {
    super(Jaguar.factor(592).divisorsSorted());
  }
}
