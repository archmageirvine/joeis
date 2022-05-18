package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018751 Divisors of 970.
 * @author Sean A. Irvine
 */
public class A018751 extends FiniteSequence {

  /** Construct the sequence. */
  public A018751() {
    super(Jaguar.factor(970).divisorsSorted());
  }
}
