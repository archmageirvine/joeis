package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018348 Divisors of 236.
 * @author Sean A. Irvine
 */
public class A018348 extends FiniteSequence {

  /** Construct the sequence. */
  public A018348() {
    super(Jaguar.factor(236).divisorsSorted());
  }
}
