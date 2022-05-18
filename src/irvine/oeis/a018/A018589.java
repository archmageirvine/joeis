package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018589 Divisors of 680.
 * @author Sean A. Irvine
 */
public class A018589 extends FiniteSequence {

  /** Construct the sequence. */
  public A018589() {
    super(Jaguar.factor(680).divisorsSorted());
  }
}
