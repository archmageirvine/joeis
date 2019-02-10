package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018305.
 * @author Sean A. Irvine
 */
public class A018305 extends FiniteSequence {

  /** Construct the sequence. */
  public A018305() {
    super(Cheetah.factor(150).divisorsSorted());
  }
}
