package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018505.
 * @author Sean A. Irvine
 */
public class A018505 extends FiniteSequence {

  /** Construct the sequence. */
  public A018505() {
    super(Cheetah.factor(532).divisorsSorted());
  }
}
