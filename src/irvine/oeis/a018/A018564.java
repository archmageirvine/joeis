package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018564 Divisors of 639.
 * @author Sean A. Irvine
 */
public class A018564 extends FiniteSequence {

  /** Construct the sequence. */
  public A018564() {
    super(Jaguar.factor(639).divisorsSorted());
  }
}
