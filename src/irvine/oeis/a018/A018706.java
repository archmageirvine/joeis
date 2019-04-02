package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018706 Divisors of 892.
 * @author Sean A. Irvine
 */
public class A018706 extends FiniteSequence {

  /** Construct the sequence. */
  public A018706() {
    super(Cheetah.factor(892).divisorsSorted());
  }
}
