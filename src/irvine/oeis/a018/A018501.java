package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018501 Divisors of 525.
 * @author Sean A. Irvine
 */
public class A018501 extends FiniteSequence {

  /** Construct the sequence. */
  public A018501() {
    super(Cheetah.factor(525).divisorsSorted());
  }
}
