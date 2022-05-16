package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018524 Divisors of 570.
 * @author Sean A. Irvine
 */
public class A018524 extends FiniteSequence {

  /** Construct the sequence. */
  public A018524() {
    super(Jaguar.factor(570).divisorsSorted());
  }
}
