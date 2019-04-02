package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018657 Divisors of 806.
 * @author Sean A. Irvine
 */
public class A018657 extends FiniteSequence {

  /** Construct the sequence. */
  public A018657() {
    super(Cheetah.factor(806).divisorsSorted());
  }
}
