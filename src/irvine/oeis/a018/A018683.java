package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018683 Divisors of 852.
 * @author Sean A. Irvine
 */
public class A018683 extends FiniteSequence {

  /** Construct the sequence. */
  public A018683() {
    super(1, FINITE, Jaguar.factor(852).divisorsSorted());
  }
}
