package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018775 Divisors of 1014.
 * @author Sean A. Irvine
 */
public class A018775 extends FiniteSequence {

  /** Construct the sequence. */
  public A018775() {
    super(Cheetah.factor(1014).divisorsSorted());
  }
}
