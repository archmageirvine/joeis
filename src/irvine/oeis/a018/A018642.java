package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018642 Divisors of 780.
 * @author Sean A. Irvine
 */
public class A018642 extends FiniteSequence {

  /** Construct the sequence. */
  public A018642() {
    super(Jaguar.factor(780).divisorsSorted());
  }
}
