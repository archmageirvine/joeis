package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018667 Divisors of 825.
 * @author Sean A. Irvine
 */
public class A018667 extends FiniteSequence {

  /** Construct the sequence. */
  public A018667() {
    super(Cheetah.factor(825).divisorsSorted());
  }
}
