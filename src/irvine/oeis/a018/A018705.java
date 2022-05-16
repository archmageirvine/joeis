package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018705 Divisors of 891.
 * @author Sean A. Irvine
 */
public class A018705 extends FiniteSequence {

  /** Construct the sequence. */
  public A018705() {
    super(Jaguar.factor(891).divisorsSorted());
  }
}
