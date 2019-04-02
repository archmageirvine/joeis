package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018445 Divisors of 423.
 * @author Sean A. Irvine
 */
public class A018445 extends FiniteSequence {

  /** Construct the sequence. */
  public A018445() {
    super(Cheetah.factor(423).divisorsSorted());
  }
}
