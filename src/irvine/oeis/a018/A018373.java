package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018373 Divisors of 284.
 * @author Sean A. Irvine
 */
public class A018373 extends FiniteSequence {

  /** Construct the sequence. */
  public A018373() {
    super(Jaguar.factor(284).divisorsSorted());
  }
}
