package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018420.
 * @author Sean A. Irvine
 */
public class A018420 extends FiniteSequence {

  /** Construct the sequence. */
  public A018420() {
    super(Cheetah.factor(374).divisorsSorted());
  }
}
