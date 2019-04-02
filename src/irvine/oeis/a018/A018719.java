package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018719 Divisors of 915.
 * @author Sean A. Irvine
 */
public class A018719 extends FiniteSequence {

  /** Construct the sequence. */
  public A018719() {
    super(Cheetah.factor(915).divisorsSorted());
  }
}
