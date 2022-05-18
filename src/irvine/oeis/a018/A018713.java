package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018713 Divisors of 904.
 * @author Sean A. Irvine
 */
public class A018713 extends FiniteSequence {

  /** Construct the sequence. */
  public A018713() {
    super(Jaguar.factor(904).divisorsSorted());
  }
}
