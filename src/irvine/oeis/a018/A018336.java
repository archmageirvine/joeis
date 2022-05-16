package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018336 Divisors of 210.
 * @author Sean A. Irvine
 */
public class A018336 extends FiniteSequence {

  /** Construct the sequence. */
  public A018336() {
    super(Jaguar.factor(210).divisorsSorted());
  }
}
