package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018745 Divisors of 962.
 * @author Sean A. Irvine
 */
public class A018745 extends FiniteSequence {

  /** Construct the sequence. */
  public A018745() {
    super(Cheetah.factor(962).divisorsSorted());
  }
}
