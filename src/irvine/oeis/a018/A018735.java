package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018735 Divisors of 944.
 * @author Sean A. Irvine
 */
public class A018735 extends FiniteSequence {

  /** Construct the sequence. */
  public A018735() {
    super(Jaguar.factor(944).divisorsSorted());
  }
}
