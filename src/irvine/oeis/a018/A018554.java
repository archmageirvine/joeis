package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018554 Divisors of 620.
 * @author Sean A. Irvine
 */
public class A018554 extends FiniteSequence {

  /** Construct the sequence. */
  public A018554() {
    super(1, FINITE, Jaguar.factor(620).divisorsSorted());
  }
}
