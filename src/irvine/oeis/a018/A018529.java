package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018529 Divisors of 578.
 * @author Sean A. Irvine
 */
public class A018529 extends FiniteSequence {

  /** Construct the sequence. */
  public A018529() {
    super(1, FINITE, Jaguar.factor(578).divisorsSorted());
  }
}
