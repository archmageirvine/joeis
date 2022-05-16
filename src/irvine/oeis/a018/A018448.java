package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018448 Divisors of 426.
 * @author Sean A. Irvine
 */
public class A018448 extends FiniteSequence {

  /** Construct the sequence. */
  public A018448() {
    super(Jaguar.factor(426).divisorsSorted());
  }
}
