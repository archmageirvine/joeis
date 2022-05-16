package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018679 Divisors of 846.
 * @author Sean A. Irvine
 */
public class A018679 extends FiniteSequence {

  /** Construct the sequence. */
  public A018679() {
    super(Jaguar.factor(846).divisorsSorted());
  }
}
