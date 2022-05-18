package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018306 Divisors of 152.
 * @author Sean A. Irvine
 */
public class A018306 extends FiniteSequence {

  /** Construct the sequence. */
  public A018306() {
    super(Jaguar.factor(152).divisorsSorted());
  }
}
