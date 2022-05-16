package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018712 Divisors of 903.
 * @author Sean A. Irvine
 */
public class A018712 extends FiniteSequence {

  /** Construct the sequence. */
  public A018712() {
    super(Jaguar.factor(903).divisorsSorted());
  }
}
