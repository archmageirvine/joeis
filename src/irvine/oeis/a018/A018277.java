package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018277 Divisors of 88.
 * @author Sean A. Irvine
 */
public class A018277 extends FiniteSequence {

  /** Construct the sequence. */
  public A018277() {
    super(Jaguar.factor(88).divisorsSorted());
  }
}
