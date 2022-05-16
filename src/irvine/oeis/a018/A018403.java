package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018403 Divisors of 344.
 * @author Sean A. Irvine
 */
public class A018403 extends FiniteSequence {

  /** Construct the sequence. */
  public A018403() {
    super(Jaguar.factor(344).divisorsSorted());
  }
}
