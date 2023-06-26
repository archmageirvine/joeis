package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018393 Divisors of 324.
 * @author Sean A. Irvine
 */
public class A018393 extends FiniteSequence {

  /** Construct the sequence. */
  public A018393() {
    super(1, FINITE, Jaguar.factor(324).divisorsSorted());
  }
}
