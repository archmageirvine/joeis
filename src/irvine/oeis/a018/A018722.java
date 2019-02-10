package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018722.
 * @author Sean A. Irvine
 */
public class A018722 extends FiniteSequence {

  /** Construct the sequence. */
  public A018722() {
    super(Cheetah.factor(920).divisorsSorted());
  }
}
