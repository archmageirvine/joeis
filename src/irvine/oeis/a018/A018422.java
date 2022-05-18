package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018422 Divisors of 376.
 * @author Sean A. Irvine
 */
public class A018422 extends FiniteSequence {

  /** Construct the sequence. */
  public A018422() {
    super(Jaguar.factor(376).divisorsSorted());
  }
}
