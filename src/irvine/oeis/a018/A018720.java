package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018720 Divisors of 916.
 * @author Sean A. Irvine
 */
public class A018720 extends FiniteSequence {

  /** Construct the sequence. */
  public A018720() {
    super(Jaguar.factor(916).divisorsSorted());
  }
}
