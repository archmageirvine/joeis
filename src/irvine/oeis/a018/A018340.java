package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018340 Divisors of 222.
 * @author Sean A. Irvine
 */
public class A018340 extends FiniteSequence {

  /** Construct the sequence. */
  public A018340() {
    super(Cheetah.factor(222).divisorsSorted());
  }
}
