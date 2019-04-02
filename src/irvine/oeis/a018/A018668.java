package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018668 Divisors of 826.
 * @author Sean A. Irvine
 */
public class A018668 extends FiniteSequence {

  /** Construct the sequence. */
  public A018668() {
    super(Cheetah.factor(826).divisorsSorted());
  }
}
