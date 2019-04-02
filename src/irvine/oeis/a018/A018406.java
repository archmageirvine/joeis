package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018406 Divisors of 350.
 * @author Sean A. Irvine
 */
public class A018406 extends FiniteSequence {

  /** Construct the sequence. */
  public A018406() {
    super(Cheetah.factor(350).divisorsSorted());
  }
}
