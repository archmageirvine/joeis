package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018583 Divisors of 668.
 * @author Sean A. Irvine
 */
public class A018583 extends FiniteSequence {

  /** Construct the sequence. */
  public A018583() {
    super(Jaguar.factor(668).divisorsSorted());
  }
}
