package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018536 Divisors of 592.
 * @author Sean A. Irvine
 */
public class A018536 extends FiniteSequence {

  /** Construct the sequence. */
  public A018536() {
    super(Cheetah.factor(592).divisorsSorted());
  }
}
