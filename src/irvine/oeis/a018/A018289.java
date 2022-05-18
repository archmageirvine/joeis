package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018289 Divisors of 112.
 * @author Sean A. Irvine
 */
public class A018289 extends FiniteSequence {

  /** Construct the sequence. */
  public A018289() {
    super(Jaguar.factor(112).divisorsSorted());
  }
}
