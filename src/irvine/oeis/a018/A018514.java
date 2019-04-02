package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018514 Divisors of 550.
 * @author Sean A. Irvine
 */
public class A018514 extends FiniteSequence {

  /** Construct the sequence. */
  public A018514() {
    super(Cheetah.factor(550).divisorsSorted());
  }
}
