package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018770 Divisors of 1004.
 * @author Sean A. Irvine
 */
public class A018770 extends FiniteSequence {

  /** Construct the sequence. */
  public A018770() {
    super(Cheetah.factor(1004).divisorsSorted());
  }
}
