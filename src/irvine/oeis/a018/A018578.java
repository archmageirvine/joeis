package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018578 Divisors of 660.
 * @author Sean A. Irvine
 */
public class A018578 extends FiniteSequence {

  /** Construct the sequence. */
  public A018578() {
    super(Jaguar.factor(660).divisorsSorted());
  }
}
