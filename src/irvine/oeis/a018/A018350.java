package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018350.
 * @author Sean A. Irvine
 */
public class A018350 extends FiniteSequence {

  /** Construct the sequence. */
  public A018350() {
    super(Cheetah.factor(240).divisorsSorted());
  }
}
