package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018360 Divisors of 260.
 * @author Sean A. Irvine
 */
public class A018360 extends FiniteSequence {

  /** Construct the sequence. */
  public A018360() {
    super(Jaguar.factor(260).divisorsSorted());
  }
}
