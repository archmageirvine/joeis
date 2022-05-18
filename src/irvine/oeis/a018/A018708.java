package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018708 Divisors of 896.
 * @author Sean A. Irvine
 */
public class A018708 extends FiniteSequence {

  /** Construct the sequence. */
  public A018708() {
    super(Jaguar.factor(896).divisorsSorted());
  }
}
