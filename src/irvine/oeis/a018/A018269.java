package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018269 Divisors of 68.
 * @author Sean A. Irvine
 */
public class A018269 extends FiniteSequence {

  /** Construct the sequence. */
  public A018269() {
    super(Cheetah.factor(68).divisorsSorted());
  }
}

