package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018507.
 * @author Sean A. Irvine
 */
public class A018507 extends FiniteSequence {

  /** Construct the sequence. */
  public A018507() {
    super(Cheetah.factor(536).divisorsSorted());
  }
}
