package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018638 Divisors of 774.
 * @author Sean A. Irvine
 */
public class A018638 extends FiniteSequence {

  /** Construct the sequence. */
  public A018638() {
    super(Jaguar.factor(774).divisorsSorted());
  }
}
