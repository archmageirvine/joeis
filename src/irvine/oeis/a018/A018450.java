package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018450.
 * @author Sean A. Irvine
 */
public class A018450 extends FiniteSequence {

  /** Construct the sequence. */
  public A018450() {
    super(Cheetah.factor(429).divisorsSorted());
  }
}
