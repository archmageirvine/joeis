package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018325 Divisors of 188.
 * @author Sean A. Irvine
 */
public class A018325 extends FiniteSequence {

  /** Construct the sequence. */
  public A018325() {
    super(1, FINITE, Jaguar.factor(188).divisorsSorted());
  }
}
