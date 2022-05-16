package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018475 Divisors of 475.
 * @author Sean A. Irvine
 */
public class A018475 extends FiniteSequence {

  /** Construct the sequence. */
  public A018475() {
    super(Jaguar.factor(475).divisorsSorted());
  }
}
