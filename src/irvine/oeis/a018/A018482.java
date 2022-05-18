package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018482 Divisors of 488.
 * @author Sean A. Irvine
 */
public class A018482 extends FiniteSequence {

  /** Construct the sequence. */
  public A018482() {
    super(Jaguar.factor(488).divisorsSorted());
  }
}
