package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018302 Divisors of 144.
 * @author Sean A. Irvine
 */
public class A018302 extends FiniteSequence {

  /** Construct the sequence. */
  public A018302() {
    super(1, FINITE, Jaguar.factor(144).divisorsSorted());
  }
}
