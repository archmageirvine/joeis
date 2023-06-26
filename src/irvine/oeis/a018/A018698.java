package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018698 Divisors of 876.
 * @author Sean A. Irvine
 */
public class A018698 extends FiniteSequence {

  /** Construct the sequence. */
  public A018698() {
    super(1, FINITE, Jaguar.factor(876).divisorsSorted());
  }
}
