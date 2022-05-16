package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018474 Divisors of 474.
 * @author Sean A. Irvine
 */
public class A018474 extends FiniteSequence {

  /** Construct the sequence. */
  public A018474() {
    super(Jaguar.factor(474).divisorsSorted());
  }
}
