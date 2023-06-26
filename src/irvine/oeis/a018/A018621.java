package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018621 Divisors of 741.
 * @author Sean A. Irvine
 */
public class A018621 extends FiniteSequence {

  /** Construct the sequence. */
  public A018621() {
    super(1, FINITE, Jaguar.factor(741).divisorsSorted());
  }
}
