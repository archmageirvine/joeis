package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018286 Divisors of 105.
 * @author Sean A. Irvine
 */
public class A018286 extends FiniteSequence {

  /** Construct the sequence. */
  public A018286() {
    super(1, FINITE, Jaguar.factor(105).divisorsSorted());
  }
}
