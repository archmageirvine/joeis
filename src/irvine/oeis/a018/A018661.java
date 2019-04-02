package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018661 Divisors of 814.
 * @author Sean A. Irvine
 */
public class A018661 extends FiniteSequence {

  /** Construct the sequence. */
  public A018661() {
    super(Cheetah.factor(814).divisorsSorted());
  }
}
