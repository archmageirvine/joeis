package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018319 Divisors of 175.
 * @author Sean A. Irvine
 */
public class A018319 extends FiniteSequence {

  /** Construct the sequence. */
  public A018319() {
    super(Jaguar.factor(175).divisorsSorted());
  }
}
