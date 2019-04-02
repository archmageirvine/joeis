package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018467 Divisors of 460.
 * @author Sean A. Irvine
 */
public class A018467 extends FiniteSequence {

  /** Construct the sequence. */
  public A018467() {
    super(Cheetah.factor(460).divisorsSorted());
  }
}
