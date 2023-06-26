package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018513 Divisors of 549.
 * @author Sean A. Irvine
 */
public class A018513 extends FiniteSequence {

  /** Construct the sequence. */
  public A018513() {
    super(1, FINITE, Jaguar.factor(549).divisorsSorted());
  }
}
