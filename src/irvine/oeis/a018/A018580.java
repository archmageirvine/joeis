package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018580 Divisors of 664.
 * @author Sean A. Irvine
 */
public class A018580 extends FiniteSequence {

  /** Construct the sequence. */
  public A018580() {
    super(Jaguar.factor(664).divisorsSorted());
  }
}
