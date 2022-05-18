package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018357 Divisors of 252.
 * @author Sean A. Irvine
 */
public class A018357 extends FiniteSequence {

  /** Construct the sequence. */
  public A018357() {
    super(Jaguar.factor(252).divisorsSorted());
  }
}
