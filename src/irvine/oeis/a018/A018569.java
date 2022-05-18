package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018569 Divisors of 646.
 * @author Sean A. Irvine
 */
public class A018569 extends FiniteSequence {

  /** Construct the sequence. */
  public A018569() {
    super(Jaguar.factor(646).divisorsSorted());
  }
}
