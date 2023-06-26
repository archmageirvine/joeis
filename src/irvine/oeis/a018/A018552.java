package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018552 Divisors of 616.
 * @author Sean A. Irvine
 */
public class A018552 extends FiniteSequence {

  /** Construct the sequence. */
  public A018552() {
    super(1, FINITE, Jaguar.factor(616).divisorsSorted());
  }
}
