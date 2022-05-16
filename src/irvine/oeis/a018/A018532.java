package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018532 Divisors of 584.
 * @author Sean A. Irvine
 */
public class A018532 extends FiniteSequence {

  /** Construct the sequence. */
  public A018532() {
    super(Jaguar.factor(584).divisorsSorted());
  }
}
