package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018761 Divisors of 988.
 * @author Sean A. Irvine
 */
public class A018761 extends FiniteSequence {

  /** Construct the sequence. */
  public A018761() {
    super(Cheetah.factor(988).divisorsSorted());
  }
}
