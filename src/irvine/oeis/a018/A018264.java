package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018264 Divisors of 54.
 * @author Sean A. Irvine
 */
public class A018264 extends FiniteSequence {

  /** Construct the sequence. */
  public A018264() {
    super(Cheetah.factor(54).divisorsSorted());
  }
}

