package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018471 Divisors of 468.
 * @author Sean A. Irvine
 */
public class A018471 extends FiniteSequence {

  /** Construct the sequence. */
  public A018471() {
    super(Jaguar.factor(468).divisorsSorted());
  }
}
