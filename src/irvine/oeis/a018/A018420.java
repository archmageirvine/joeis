package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018420 Divisors of 374.
 * @author Sean A. Irvine
 */
public class A018420 extends FiniteSequence {

  /** Construct the sequence. */
  public A018420() {
    super(Jaguar.factor(374).divisorsSorted());
  }
}
