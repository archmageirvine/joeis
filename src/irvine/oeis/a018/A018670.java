package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018670 Divisors of 830.
 * @author Sean A. Irvine
 */
public class A018670 extends FiniteSequence {

  /** Construct the sequence. */
  public A018670() {
    super(Jaguar.factor(830).divisorsSorted());
  }
}
