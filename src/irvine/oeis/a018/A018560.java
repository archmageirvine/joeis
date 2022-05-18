package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018560 Divisors of 632.
 * @author Sean A. Irvine
 */
public class A018560 extends FiniteSequence {

  /** Construct the sequence. */
  public A018560() {
    super(Jaguar.factor(632).divisorsSorted());
  }
}
