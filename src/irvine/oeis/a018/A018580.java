package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018580 Divisors of 664.
 * @author Sean A. Irvine
 */
public class A018580 extends FiniteSequence {

  /** Construct the sequence. */
  public A018580() {
    super(Cheetah.factor(664).divisorsSorted());
  }
}
