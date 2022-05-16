package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018620 Divisors of 740.
 * @author Sean A. Irvine
 */
public class A018620 extends FiniteSequence {

  /** Construct the sequence. */
  public A018620() {
    super(Jaguar.factor(740).divisorsSorted());
  }
}
