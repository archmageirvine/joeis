package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018496 Divisors of 516.
 * @author Sean A. Irvine
 */
public class A018496 extends FiniteSequence {

  /** Construct the sequence. */
  public A018496() {
    super(Cheetah.factor(516).divisorsSorted());
  }
}
