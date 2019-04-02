package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018764 Divisors of 994.
 * @author Sean A. Irvine
 */
public class A018764 extends FiniteSequence {

  /** Construct the sequence. */
  public A018764() {
    super(Cheetah.factor(994).divisorsSorted());
  }
}
