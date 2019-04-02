package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018395 Divisors of 328.
 * @author Sean A. Irvine
 */
public class A018395 extends FiniteSequence {

  /** Construct the sequence. */
  public A018395() {
    super(Cheetah.factor(328).divisorsSorted());
  }
}
