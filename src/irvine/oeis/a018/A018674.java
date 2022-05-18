package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018674 Divisors of 836.
 * @author Sean A. Irvine
 */
public class A018674 extends FiniteSequence {

  /** Construct the sequence. */
  public A018674() {
    super(Jaguar.factor(836).divisorsSorted());
  }
}
