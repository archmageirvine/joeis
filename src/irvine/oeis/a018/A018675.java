package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018675 Divisors of 837.
 * @author Sean A. Irvine
 */
public class A018675 extends FiniteSequence {

  /** Construct the sequence. */
  public A018675() {
    super(1, FINITE, Jaguar.factor(837).divisorsSorted());
  }
}
