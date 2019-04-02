package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018617 Divisors of 735.
 * @author Sean A. Irvine
 */
public class A018617 extends FiniteSequence {

  /** Construct the sequence. */
  public A018617() {
    super(Cheetah.factor(735).divisorsSorted());
  }
}
