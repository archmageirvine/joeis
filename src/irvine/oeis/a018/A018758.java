package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018758 Divisors of 984.
 * @author Sean A. Irvine
 */
public class A018758 extends FiniteSequence {

  /** Construct the sequence. */
  public A018758() {
    super(Jaguar.factor(984).divisorsSorted());
  }
}
