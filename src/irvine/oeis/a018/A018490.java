package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018490 Divisors of 504.
 * @author Sean A. Irvine
 */
public class A018490 extends FiniteSequence {

  /** Construct the sequence. */
  public A018490() {
    super(Cheetah.factor(504).divisorsSorted());
  }
}
