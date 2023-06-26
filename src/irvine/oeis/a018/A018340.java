package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018340 Divisors of 222.
 * @author Sean A. Irvine
 */
public class A018340 extends FiniteSequence {

  /** Construct the sequence. */
  public A018340() {
    super(1, FINITE, Jaguar.factor(222).divisorsSorted());
  }
}
