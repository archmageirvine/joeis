package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018635 Divisors of 768.
 * @author Sean A. Irvine
 */
public class A018635 extends FiniteSequence {

  /** Construct the sequence. */
  public A018635() {
    super(Cheetah.factor(768).divisorsSorted());
  }
}
