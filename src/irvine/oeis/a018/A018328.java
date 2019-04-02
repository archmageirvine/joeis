package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018328 Divisors of 192.
 * @author Sean A. Irvine
 */
public class A018328 extends FiniteSequence {

  /** Construct the sequence. */
  public A018328() {
    super(Cheetah.factor(192).divisorsSorted());
  }
}
