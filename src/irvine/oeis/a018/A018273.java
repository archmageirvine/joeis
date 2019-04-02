package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018273 Divisors of 76.
 * @author Sean A. Irvine
 */
public class A018273 extends FiniteSequence {

  /** Construct the sequence. */
  public A018273() {
    super(Cheetah.factor(76).divisorsSorted());
  }
}
