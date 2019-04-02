package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018561 Divisors of 636.
 * @author Sean A. Irvine
 */
public class A018561 extends FiniteSequence {

  /** Construct the sequence. */
  public A018561() {
    super(Cheetah.factor(636).divisorsSorted());
  }
}
