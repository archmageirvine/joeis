package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018425 Divisors of 384.
 * @author Sean A. Irvine
 */
public class A018425 extends FiniteSequence {

  /** Construct the sequence. */
  public A018425() {
    super(Cheetah.factor(384).divisorsSorted());
  }
}
