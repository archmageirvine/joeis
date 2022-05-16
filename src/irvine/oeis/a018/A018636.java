package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018636 Divisors of 770.
 * @author Sean A. Irvine
 */
public class A018636 extends FiniteSequence {

  /** Construct the sequence. */
  public A018636() {
    super(Jaguar.factor(770).divisorsSorted());
  }
}
