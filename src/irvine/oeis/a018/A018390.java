package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018390 Divisors of 318.
 * @author Sean A. Irvine
 */
public class A018390 extends FiniteSequence {

  /** Construct the sequence. */
  public A018390() {
    super(Jaguar.factor(318).divisorsSorted());
  }
}
