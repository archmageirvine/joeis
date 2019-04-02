package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018619 Divisors of 738.
 * @author Sean A. Irvine
 */
public class A018619 extends FiniteSequence {

  /** Construct the sequence. */
  public A018619() {
    super(Cheetah.factor(738).divisorsSorted());
  }
}
