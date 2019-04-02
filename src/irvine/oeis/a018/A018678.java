package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018678 Divisors of 845.
 * @author Sean A. Irvine
 */
public class A018678 extends FiniteSequence {

  /** Construct the sequence. */
  public A018678() {
    super(Cheetah.factor(845).divisorsSorted());
  }
}
