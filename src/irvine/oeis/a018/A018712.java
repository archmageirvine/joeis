package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018712 Divisors of 903.
 * @author Sean A. Irvine
 */
public class A018712 extends FiniteSequence {

  /** Construct the sequence. */
  public A018712() {
    super(Cheetah.factor(903).divisorsSorted());
  }
}
