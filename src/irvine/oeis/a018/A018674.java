package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018674 Divisors of 836.
 * @author Sean A. Irvine
 */
public class A018674 extends FiniteSequence {

  /** Construct the sequence. */
  public A018674() {
    super(Cheetah.factor(836).divisorsSorted());
  }
}
