package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018418 Divisors of 370.
 * @author Sean A. Irvine
 */
public class A018418 extends FiniteSequence {

  /** Construct the sequence. */
  public A018418() {
    super(Jaguar.factor(370).divisorsSorted());
  }
}
