package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018760 Divisors of 987.
 * @author Sean A. Irvine
 */
public class A018760 extends FiniteSequence {

  /** Construct the sequence. */
  public A018760() {
    super(1, FINITE, Jaguar.factor(987).divisorsSorted());
  }
}
