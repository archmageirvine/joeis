package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018649 Divisors of 792.
 * @author Sean A. Irvine
 */
public class A018649 extends FiniteSequence {

  /** Construct the sequence. */
  public A018649() {
    super(Jaguar.factor(792).divisorsSorted());
  }
}
