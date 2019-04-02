package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018449 Divisors of 428.
 * @author Sean A. Irvine
 */
public class A018449 extends FiniteSequence {

  /** Construct the sequence. */
  public A018449() {
    super(Cheetah.factor(428).divisorsSorted());
  }
}
