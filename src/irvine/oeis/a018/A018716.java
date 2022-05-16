package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018716 Divisors of 909.
 * @author Sean A. Irvine
 */
public class A018716 extends FiniteSequence {

  /** Construct the sequence. */
  public A018716() {
    super(Jaguar.factor(909).divisorsSorted());
  }
}
