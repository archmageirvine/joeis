package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018320 Divisors of 176.
 * @author Sean A. Irvine
 */
public class A018320 extends FiniteSequence {

  /** Construct the sequence. */
  public A018320() {
    super(Cheetah.factor(176).divisorsSorted());
  }
}
