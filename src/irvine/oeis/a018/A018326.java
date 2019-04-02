package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018326 Divisors of 189.
 * @author Sean A. Irvine
 */
public class A018326 extends FiniteSequence {

  /** Construct the sequence. */
  public A018326() {
    super(Cheetah.factor(189).divisorsSorted());
  }
}
