package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018614 Divisors of 728.
 * @author Sean A. Irvine
 */
public class A018614 extends FiniteSequence {

  /** Construct the sequence. */
  public A018614() {
    super(Jaguar.factor(728).divisorsSorted());
  }
}
