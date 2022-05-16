package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018293 Divisors of 120.
 * @author Sean A. Irvine
 */
public class A018293 extends FiniteSequence {

  /** Construct the sequence. */
  public A018293() {
    super(Jaguar.factor(120).divisorsSorted());
  }
}
