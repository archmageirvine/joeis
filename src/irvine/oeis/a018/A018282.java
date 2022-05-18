package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018282 Divisors of 99.
 * @author Sean A. Irvine
 */
public class A018282 extends FiniteSequence {

  /** Construct the sequence. */
  public A018282() {
    super(Jaguar.factor(99).divisorsSorted());
  }
}
