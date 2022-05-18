package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018438 Divisors of 408.
 * @author Sean A. Irvine
 */
public class A018438 extends FiniteSequence {

  /** Construct the sequence. */
  public A018438() {
    super(Jaguar.factor(408).divisorsSorted());
  }
}
