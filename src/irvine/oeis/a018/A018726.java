package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018726 Divisors of 928.
 * @author Sean A. Irvine
 */
public class A018726 extends FiniteSequence {

  /** Construct the sequence. */
  public A018726() {
    super(1, FINITE, Jaguar.factor(928).divisorsSorted());
  }
}
