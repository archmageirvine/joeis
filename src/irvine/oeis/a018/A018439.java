package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018439 Divisors of 410.
 * @author Sean A. Irvine
 */
public class A018439 extends FiniteSequence {

  /** Construct the sequence. */
  public A018439() {
    super(Jaguar.factor(410).divisorsSorted());
  }
}
