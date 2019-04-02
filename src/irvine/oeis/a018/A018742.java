package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018742 Divisors of 956.
 * @author Sean A. Irvine
 */
public class A018742 extends FiniteSequence {

  /** Construct the sequence. */
  public A018742() {
    super(Cheetah.factor(956).divisorsSorted());
  }
}
