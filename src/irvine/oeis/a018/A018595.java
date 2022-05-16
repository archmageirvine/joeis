package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018595 Divisors of 692.
 * @author Sean A. Irvine
 */
public class A018595 extends FiniteSequence {

  /** Construct the sequence. */
  public A018595() {
    super(Jaguar.factor(692).divisorsSorted());
  }
}
