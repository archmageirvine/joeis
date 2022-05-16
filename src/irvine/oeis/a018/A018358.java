package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018358 Divisors of 255.
 * @author Sean A. Irvine
 */
public class A018358 extends FiniteSequence {

  /** Construct the sequence. */
  public A018358() {
    super(Jaguar.factor(255).divisorsSorted());
  }
}
