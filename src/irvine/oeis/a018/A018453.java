package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018453 Divisors of 434.
 * @author Sean A. Irvine
 */
public class A018453 extends FiniteSequence {

  /** Construct the sequence. */
  public A018453() {
    super(Jaguar.factor(434).divisorsSorted());
  }
}
