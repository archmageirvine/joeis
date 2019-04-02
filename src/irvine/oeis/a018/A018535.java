package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018535 Divisors of 590.
 * @author Sean A. Irvine
 */
public class A018535 extends FiniteSequence {

  /** Construct the sequence. */
  public A018535() {
    super(Cheetah.factor(590).divisorsSorted());
  }
}
