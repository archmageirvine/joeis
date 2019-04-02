package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018741 Divisors of 954.
 * @author Sean A. Irvine
 */
public class A018741 extends FiniteSequence {

  /** Construct the sequence. */
  public A018741() {
    super(Cheetah.factor(954).divisorsSorted());
  }
}
