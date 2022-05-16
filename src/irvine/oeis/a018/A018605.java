package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018605 Divisors of 712.
 * @author Sean A. Irvine
 */
public class A018605 extends FiniteSequence {

  /** Construct the sequence. */
  public A018605() {
    super(Jaguar.factor(712).divisorsSorted());
  }
}
