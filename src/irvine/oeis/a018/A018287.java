package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018287 Divisors of 108.
 * @author Sean A. Irvine
 */
public class A018287 extends FiniteSequence {

  /** Construct the sequence. */
  public A018287() {
    super(Cheetah.factor(108).divisorsSorted());
  }
}
