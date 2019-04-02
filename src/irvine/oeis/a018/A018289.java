package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018289 Divisors of 112.
 * @author Sean A. Irvine
 */
public class A018289 extends FiniteSequence {

  /** Construct the sequence. */
  public A018289() {
    super(Cheetah.factor(112).divisorsSorted());
  }
}
