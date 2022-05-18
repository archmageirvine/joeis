package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018287 Divisors of 108.
 * @author Sean A. Irvine
 */
public class A018287 extends FiniteSequence {

  /** Construct the sequence. */
  public A018287() {
    super(Jaguar.factor(108).divisorsSorted());
  }
}
