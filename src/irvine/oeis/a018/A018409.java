package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018409 Divisors of 354.
 * @author Sean A. Irvine
 */
public class A018409 extends FiniteSequence {

  /** Construct the sequence. */
  public A018409() {
    super(Cheetah.factor(354).divisorsSorted());
  }
}
