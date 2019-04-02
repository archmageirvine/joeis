package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018756 Divisors of 980.
 * @author Sean A. Irvine
 */
public class A018756 extends FiniteSequence {

  /** Construct the sequence. */
  public A018756() {
    super(Cheetah.factor(980).divisorsSorted());
  }
}
