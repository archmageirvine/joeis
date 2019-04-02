package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018257 Divisors of 40.
 * @author Sean A. Irvine
 */
public class A018257 extends FiniteSequence {

  /** Construct the sequence. */
  public A018257() {
    super(Cheetah.factor(40).divisorsSorted());
  }
}

