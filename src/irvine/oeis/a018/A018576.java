package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018576 Divisors of 657.
 * @author Sean A. Irvine
 */
public class A018576 extends FiniteSequence {

  /** Construct the sequence. */
  public A018576() {
    super(Cheetah.factor(657).divisorsSorted());
  }
}
