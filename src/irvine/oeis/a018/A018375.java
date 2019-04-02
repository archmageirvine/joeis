package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018375 Divisors of 286.
 * @author Sean A. Irvine
 */
public class A018375 extends FiniteSequence {

  /** Construct the sequence. */
  public A018375() {
    super(Cheetah.factor(286).divisorsSorted());
  }
}
