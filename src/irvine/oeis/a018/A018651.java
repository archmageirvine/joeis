package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018651 Divisors of 796.
 * @author Sean A. Irvine
 */
public class A018651 extends FiniteSequence {

  /** Construct the sequence. */
  public A018651() {
    super(Cheetah.factor(796).divisorsSorted());
  }
}
