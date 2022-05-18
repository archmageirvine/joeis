package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018324 Divisors of 186.
 * @author Sean A. Irvine
 */
public class A018324 extends FiniteSequence {

  /** Construct the sequence. */
  public A018324() {
    super(Jaguar.factor(186).divisorsSorted());
  }
}
