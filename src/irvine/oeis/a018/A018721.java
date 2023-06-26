package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018721 Divisors of 918.
 * @author Sean A. Irvine
 */
public class A018721 extends FiniteSequence {

  /** Construct the sequence. */
  public A018721() {
    super(1, FINITE, Jaguar.factor(918).divisorsSorted());
  }
}
