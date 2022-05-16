package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018579 Divisors of 663.
 * @author Sean A. Irvine
 */
public class A018579 extends FiniteSequence {

  /** Construct the sequence. */
  public A018579() {
    super(Jaguar.factor(663).divisorsSorted());
  }
}
