package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018749 Divisors of 968.
 * @author Sean A. Irvine
 */
public class A018749 extends FiniteSequence {

  /** Construct the sequence. */
  public A018749() {
    super(Cheetah.factor(968).divisorsSorted());
  }
}
