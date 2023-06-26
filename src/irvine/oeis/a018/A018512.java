package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018512 Divisors of 548.
 * @author Sean A. Irvine
 */
public class A018512 extends FiniteSequence {

  /** Construct the sequence. */
  public A018512() {
    super(1, FINITE, Jaguar.factor(548).divisorsSorted());
  }
}
