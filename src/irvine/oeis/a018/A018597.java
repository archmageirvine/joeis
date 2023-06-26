package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018597 Divisors of 696.
 * @author Sean A. Irvine
 */
public class A018597 extends FiniteSequence {

  /** Construct the sequence. */
  public A018597() {
    super(1, FINITE, Jaguar.factor(696).divisorsSorted());
  }
}
