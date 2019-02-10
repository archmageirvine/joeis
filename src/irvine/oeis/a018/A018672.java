package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018672.
 * @author Sean A. Irvine
 */
public class A018672 extends FiniteSequence {

  /** Construct the sequence. */
  public A018672() {
    super(Cheetah.factor(833).divisorsSorted());
  }
}
