package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018467 Divisors of 460.
 * @author Sean A. Irvine
 */
public class A018467 extends FiniteSequence {

  /** Construct the sequence. */
  public A018467() {
    super(Jaguar.factor(460).divisorsSorted());
  }
}
