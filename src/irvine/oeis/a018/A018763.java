package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018763 Divisors of 992.
 * @author Sean A. Irvine
 */
public class A018763 extends FiniteSequence {

  /** Construct the sequence. */
  public A018763() {
    super(Jaguar.factor(992).divisorsSorted());
  }
}
