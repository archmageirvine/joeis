package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018637 Divisors of 772.
 * @author Sean A. Irvine
 */
public class A018637 extends FiniteSequence {

  /** Construct the sequence. */
  public A018637() {
    super(Jaguar.factor(772).divisorsSorted());
  }
}
