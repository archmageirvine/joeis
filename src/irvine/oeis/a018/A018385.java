package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018385 Divisors of 308.
 * @author Sean A. Irvine
 */
public class A018385 extends FiniteSequence {

  /** Construct the sequence. */
  public A018385() {
    super(Cheetah.factor(308).divisorsSorted());
  }
}
