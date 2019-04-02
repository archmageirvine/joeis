package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018372 Divisors of 282.
 * @author Sean A. Irvine
 */
public class A018372 extends FiniteSequence {

  /** Construct the sequence. */
  public A018372() {
    super(Cheetah.factor(282).divisorsSorted());
  }
}
