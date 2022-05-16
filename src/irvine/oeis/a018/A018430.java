package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018430 Divisors of 392.
 * @author Sean A. Irvine
 */
public class A018430 extends FiniteSequence {

  /** Construct the sequence. */
  public A018430() {
    super(Jaguar.factor(392).divisorsSorted());
  }
}
