package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018495 Divisors of 513.
 * @author Sean A. Irvine
 */
public class A018495 extends FiniteSequence {

  /** Construct the sequence. */
  public A018495() {
    super(Jaguar.factor(513).divisorsSorted());
  }
}
