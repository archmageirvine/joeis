package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018485 Divisors of 494.
 * @author Sean A. Irvine
 */
public class A018485 extends FiniteSequence {

  /** Construct the sequence. */
  public A018485() {
    super(Jaguar.factor(494).divisorsSorted());
  }
}
