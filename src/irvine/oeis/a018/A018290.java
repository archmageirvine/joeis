package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018290 Divisors of 114.
 * @author Sean A. Irvine
 */
public class A018290 extends FiniteSequence {

  /** Construct the sequence. */
  public A018290() {
    super(1, FINITE, Jaguar.factor(114).divisorsSorted());
  }
}
