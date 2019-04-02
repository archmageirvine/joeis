package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018325 Divisors of 188.
 * @author Sean A. Irvine
 */
public class A018325 extends FiniteSequence {

  /** Construct the sequence. */
  public A018325() {
    super(Cheetah.factor(188).divisorsSorted());
  }
}
