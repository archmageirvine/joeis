package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018271 Divisors of 72.
 * @author Sean A. Irvine
 */
public class A018271 extends FiniteSequence {

  /** Construct the sequence. */
  public A018271() {
    super(Cheetah.factor(72).divisorsSorted());
  }
}

