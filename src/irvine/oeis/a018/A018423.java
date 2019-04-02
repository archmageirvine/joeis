package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018423 Divisors of 378.
 * @author Sean A. Irvine
 */
public class A018423 extends FiniteSequence {

  /** Construct the sequence. */
  public A018423() {
    super(Cheetah.factor(378).divisorsSorted());
  }
}
