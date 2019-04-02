package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018402 Divisors of 342.
 * @author Sean A. Irvine
 */
public class A018402 extends FiniteSequence {

  /** Construct the sequence. */
  public A018402() {
    super(Cheetah.factor(342).divisorsSorted());
  }
}
