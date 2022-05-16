package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018428 Divisors of 388.
 * @author Sean A. Irvine
 */
public class A018428 extends FiniteSequence {

  /** Construct the sequence. */
  public A018428() {
    super(Jaguar.factor(388).divisorsSorted());
  }
}
