package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018718.
 * @author Sean A. Irvine
 */
public class A018718 extends FiniteSequence {

  /** Construct the sequence. */
  public A018718() {
    super(Cheetah.factor(912).divisorsSorted());
  }
}
