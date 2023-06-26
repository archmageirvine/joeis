package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018445 Divisors of 423.
 * @author Sean A. Irvine
 */
public class A018445 extends FiniteSequence {

  /** Construct the sequence. */
  public A018445() {
    super(1, FINITE, Jaguar.factor(423).divisorsSorted());
  }
}
