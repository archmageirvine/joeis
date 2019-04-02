package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018538 Divisors of 595.
 * @author Sean A. Irvine
 */
public class A018538 extends FiniteSequence {

  /** Construct the sequence. */
  public A018538() {
    super(Cheetah.factor(595).divisorsSorted());
  }
}
