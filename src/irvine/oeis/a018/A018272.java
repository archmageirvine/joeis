package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018272 Divisors of 75.
 * @author Sean A. Irvine
 */
public class A018272 extends FiniteSequence {

  /** Construct the sequence. */
  public A018272() {
    super(Cheetah.factor(75).divisorsSorted());
  }
}

