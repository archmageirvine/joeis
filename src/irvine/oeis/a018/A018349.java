package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018349 Divisors of 238.
 * @author Sean A. Irvine
 */
public class A018349 extends FiniteSequence {

  /** Construct the sequence. */
  public A018349() {
    super(Cheetah.factor(238).divisorsSorted());
  }
}
