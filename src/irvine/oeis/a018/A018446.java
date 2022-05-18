package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018446 Divisors of 424.
 * @author Sean A. Irvine
 */
public class A018446 extends FiniteSequence {

  /** Construct the sequence. */
  public A018446() {
    super(Jaguar.factor(424).divisorsSorted());
  }
}
