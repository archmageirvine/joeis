package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018672 Divisors of 833.
 * @author Sean A. Irvine
 */
public class A018672 extends FiniteSequence {

  /** Construct the sequence. */
  public A018672() {
    super(Jaguar.factor(833).divisorsSorted());
  }
}
