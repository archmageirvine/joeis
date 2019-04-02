package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018632 Divisors of 762.
 * @author Sean A. Irvine
 */
public class A018632 extends FiniteSequence {

  /** Construct the sequence. */
  public A018632() {
    super(Cheetah.factor(762).divisorsSorted());
  }
}
