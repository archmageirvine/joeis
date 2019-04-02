package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018419 Divisors of 372.
 * @author Sean A. Irvine
 */
public class A018419 extends FiniteSequence {

  /** Construct the sequence. */
  public A018419() {
    super(Cheetah.factor(372).divisorsSorted());
  }
}
