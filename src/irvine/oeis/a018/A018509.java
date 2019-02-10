package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018509.
 * @author Sean A. Irvine
 */
public class A018509 extends FiniteSequence {

  /** Construct the sequence. */
  public A018509() {
    super(Cheetah.factor(540).divisorsSorted());
  }
}
