package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018768 Divisors of 1001.
 * @author Sean A. Irvine
 */
public class A018768 extends FiniteSequence {

  /** Construct the sequence. */
  public A018768() {
    super(Jaguar.factor(1001).divisorsSorted());
  }
}
