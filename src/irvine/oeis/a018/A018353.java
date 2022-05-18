package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018353 Divisors of 245.
 * @author Sean A. Irvine
 */
public class A018353 extends FiniteSequence {

  /** Construct the sequence. */
  public A018353() {
    super(Jaguar.factor(245).divisorsSorted());
  }
}
