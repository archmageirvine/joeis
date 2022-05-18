package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018323 Divisors of 184.
 * @author Sean A. Irvine
 */
public class A018323 extends FiniteSequence {

  /** Construct the sequence. */
  public A018323() {
    super(Jaguar.factor(184).divisorsSorted());
  }
}
