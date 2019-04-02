package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018659 Divisors of 810.
 * @author Sean A. Irvine
 */
public class A018659 extends FiniteSequence {

  /** Construct the sequence. */
  public A018659() {
    super(Cheetah.factor(810).divisorsSorted());
  }
}
