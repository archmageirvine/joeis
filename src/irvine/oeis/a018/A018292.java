package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018292 Divisors of 117.
 * @author Sean A. Irvine
 */
public class A018292 extends FiniteSequence {

  /** Construct the sequence. */
  public A018292() {
    super(1, FINITE, Jaguar.factor(117).divisorsSorted());
  }
}
