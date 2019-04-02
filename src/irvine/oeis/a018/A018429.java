package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018429 Divisors of 390.
 * @author Sean A. Irvine
 */
public class A018429 extends FiniteSequence {

  /** Construct the sequence. */
  public A018429() {
    super(Cheetah.factor(390).divisorsSorted());
  }
}
