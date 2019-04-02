package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018332 Divisors of 200.
 * @author Sean A. Irvine
 */
public class A018332 extends FiniteSequence {

  /** Construct the sequence. */
  public A018332() {
    super(Cheetah.factor(200).divisorsSorted());
  }
}
