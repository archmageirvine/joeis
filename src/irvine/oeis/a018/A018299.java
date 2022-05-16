package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018299 Divisors of 136.
 * @author Sean A. Irvine
 */
public class A018299 extends FiniteSequence {

  /** Construct the sequence. */
  public A018299() {
    super(Jaguar.factor(136).divisorsSorted());
  }
}
