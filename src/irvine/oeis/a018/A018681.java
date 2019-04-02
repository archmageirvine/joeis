package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018681 Divisors of 848.
 * @author Sean A. Irvine
 */
public class A018681 extends FiniteSequence {

  /** Construct the sequence. */
  public A018681() {
    super(Cheetah.factor(848).divisorsSorted());
  }
}
