package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018300 Divisors of 138.
 * @author Sean A. Irvine
 */
public class A018300 extends FiniteSequence {

  /** Construct the sequence. */
  public A018300() {
    super(Cheetah.factor(138).divisorsSorted());
  }
}
