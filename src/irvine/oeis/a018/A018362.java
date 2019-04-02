package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018362 Divisors of 264.
 * @author Sean A. Irvine
 */
public class A018362 extends FiniteSequence {

  /** Construct the sequence. */
  public A018362() {
    super(Cheetah.factor(264).divisorsSorted());
  }
}
