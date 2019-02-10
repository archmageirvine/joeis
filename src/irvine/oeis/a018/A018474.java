package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018474.
 * @author Sean A. Irvine
 */
public class A018474 extends FiniteSequence {

  /** Construct the sequence. */
  public A018474() {
    super(Cheetah.factor(474).divisorsSorted());
  }
}
