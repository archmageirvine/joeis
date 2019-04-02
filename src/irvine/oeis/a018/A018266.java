package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018266 Divisors of 60.
 * @author Sean A. Irvine
 */
public class A018266 extends FiniteSequence {

  /** Construct the sequence. */
  public A018266() {
    super(Cheetah.factor(60).divisorsSorted());
  }
}

