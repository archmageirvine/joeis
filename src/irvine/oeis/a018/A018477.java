package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018477 Divisors of 477.
 * @author Sean A. Irvine
 */
public class A018477 extends FiniteSequence {

  /** Construct the sequence. */
  public A018477() {
    super(Jaguar.factor(477).divisorsSorted());
  }
}
