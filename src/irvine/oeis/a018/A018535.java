package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018535 Divisors of 590.
 * @author Sean A. Irvine
 */
public class A018535 extends FiniteSequence {

  /** Construct the sequence. */
  public A018535() {
    super(Jaguar.factor(590).divisorsSorted());
  }
}
