package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018689 Divisors of 861.
 * @author Sean A. Irvine
 */
public class A018689 extends FiniteSequence {

  /** Construct the sequence. */
  public A018689() {
    super(Jaguar.factor(861).divisorsSorted());
  }
}
