package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018537 Divisors of 594.
 * @author Sean A. Irvine
 */
public class A018537 extends FiniteSequence {

  /** Construct the sequence. */
  public A018537() {
    super(Jaguar.factor(594).divisorsSorted());
  }
}
