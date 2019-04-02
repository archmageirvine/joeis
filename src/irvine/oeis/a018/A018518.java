package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018518 Divisors of 558.
 * @author Sean A. Irvine
 */
public class A018518 extends FiniteSequence {

  /** Construct the sequence. */
  public A018518() {
    super(Cheetah.factor(558).divisorsSorted());
  }
}
