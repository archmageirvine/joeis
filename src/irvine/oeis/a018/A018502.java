package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018502 Divisors of 528.
 * @author Sean A. Irvine
 */
public class A018502 extends FiniteSequence {

  /** Construct the sequence. */
  public A018502() {
    super(Cheetah.factor(528).divisorsSorted());
  }
}
