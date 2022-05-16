package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018521 Divisors of 564.
 * @author Sean A. Irvine
 */
public class A018521 extends FiniteSequence {

  /** Construct the sequence. */
  public A018521() {
    super(Jaguar.factor(564).divisorsSorted());
  }
}
