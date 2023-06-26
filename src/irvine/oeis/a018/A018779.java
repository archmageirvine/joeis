package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018779 Divisors of 1020.
 * @author Sean A. Irvine
 */
public class A018779 extends FiniteSequence {

  /** Construct the sequence. */
  public A018779() {
    super(1, FINITE, Jaguar.factor(1020).divisorsSorted());
  }
}
