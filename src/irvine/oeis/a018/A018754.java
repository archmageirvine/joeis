package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018754 Divisors of 976.
 * @author Sean A. Irvine
 */
public class A018754 extends FiniteSequence {

  /** Construct the sequence. */
  public A018754() {
    super(Cheetah.factor(976).divisorsSorted());
  }
}
