package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018652 Divisors of 798.
 * @author Sean A. Irvine
 */
public class A018652 extends FiniteSequence {

  /** Construct the sequence. */
  public A018652() {
    super(Jaguar.factor(798).divisorsSorted());
  }
}
