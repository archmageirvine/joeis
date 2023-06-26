package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018650 Divisors of 795.
 * @author Sean A. Irvine
 */
public class A018650 extends FiniteSequence {

  /** Construct the sequence. */
  public A018650() {
    super(1, FINITE, Jaguar.factor(795).divisorsSorted());
  }
}
