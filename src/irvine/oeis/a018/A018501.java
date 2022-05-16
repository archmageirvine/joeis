package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018501 Divisors of 525.
 * @author Sean A. Irvine
 */
public class A018501 extends FiniteSequence {

  /** Construct the sequence. */
  public A018501() {
    super(Jaguar.factor(525).divisorsSorted());
  }
}
