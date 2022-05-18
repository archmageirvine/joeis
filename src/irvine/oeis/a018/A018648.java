package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018648 Divisors of 790.
 * @author Sean A. Irvine
 */
public class A018648 extends FiniteSequence {

  /** Construct the sequence. */
  public A018648() {
    super(Jaguar.factor(790).divisorsSorted());
  }
}
