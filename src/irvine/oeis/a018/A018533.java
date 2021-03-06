package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018533 Divisors of 585.
 * @author Sean A. Irvine
 */
public class A018533 extends FiniteSequence {

  /** Construct the sequence. */
  public A018533() {
    super(Cheetah.factor(585).divisorsSorted());
  }
}
