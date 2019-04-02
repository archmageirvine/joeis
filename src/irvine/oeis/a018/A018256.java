package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018256 Divisors of 36.
 * @author Sean A. Irvine
 */
public class A018256 extends FiniteSequence {

  /** Construct the sequence. */
  public A018256() {
    super(Cheetah.factor(36).divisorsSorted());
  }
}

