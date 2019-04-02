package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018654 Divisors of 801.
 * @author Sean A. Irvine
 */
public class A018654 extends FiniteSequence {

  /** Construct the sequence. */
  public A018654() {
    super(Cheetah.factor(801).divisorsSorted());
  }
}
