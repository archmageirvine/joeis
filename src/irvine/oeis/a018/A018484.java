package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018484 Divisors of 492.
 * @author Sean A. Irvine
 */
public class A018484 extends FiniteSequence {

  /** Construct the sequence. */
  public A018484() {
    super(Jaguar.factor(492).divisorsSorted());
  }
}
