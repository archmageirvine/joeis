package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018507 Divisors of 536.
 * @author Sean A. Irvine
 */
public class A018507 extends FiniteSequence {

  /** Construct the sequence. */
  public A018507() {
    super(Jaguar.factor(536).divisorsSorted());
  }
}
