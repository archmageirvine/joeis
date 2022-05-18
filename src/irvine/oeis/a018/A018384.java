package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018384 Divisors of 306.
 * @author Sean A. Irvine
 */
public class A018384 extends FiniteSequence {

  /** Construct the sequence. */
  public A018384() {
    super(Jaguar.factor(306).divisorsSorted());
  }
}
