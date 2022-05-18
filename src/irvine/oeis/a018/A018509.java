package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018509 Divisors of 540.
 * @author Sean A. Irvine
 */
public class A018509 extends FiniteSequence {

  /** Construct the sequence. */
  public A018509() {
    super(Jaguar.factor(540).divisorsSorted());
  }
}
