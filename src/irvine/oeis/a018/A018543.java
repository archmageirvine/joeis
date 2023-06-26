package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018543 Divisors of 603.
 * @author Sean A. Irvine
 */
public class A018543 extends FiniteSequence {

  /** Construct the sequence. */
  public A018543() {
    super(1, FINITE, Jaguar.factor(603).divisorsSorted());
  }
}
