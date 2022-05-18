package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018572 Divisors of 651.
 * @author Sean A. Irvine
 */
public class A018572 extends FiniteSequence {

  /** Construct the sequence. */
  public A018572() {
    super(Jaguar.factor(651).divisorsSorted());
  }
}
