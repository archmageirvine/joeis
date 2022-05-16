package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018481 Divisors of 486.
 * @author Sean A. Irvine
 */
public class A018481 extends FiniteSequence {

  /** Construct the sequence. */
  public A018481() {
    super(Jaguar.factor(486).divisorsSorted());
  }
}
