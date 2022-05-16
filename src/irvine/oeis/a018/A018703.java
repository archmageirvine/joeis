package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018703 Divisors of 888.
 * @author Sean A. Irvine
 */
public class A018703 extends FiniteSequence {

  /** Construct the sequence. */
  public A018703() {
    super(Jaguar.factor(888).divisorsSorted());
  }
}
