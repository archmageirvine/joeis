package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018602 Divisors of 708.
 * @author Sean A. Irvine
 */
public class A018602 extends FiniteSequence {

  /** Construct the sequence. */
  public A018602() {
    super(Jaguar.factor(708).divisorsSorted());
  }
}
