package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018531 Divisors of 582.
 * @author Sean A. Irvine
 */
public class A018531 extends FiniteSequence {

  /** Construct the sequence. */
  public A018531() {
    super(Cheetah.factor(582).divisorsSorted());
  }
}
