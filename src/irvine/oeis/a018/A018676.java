package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018676.
 * @author Sean A. Irvine
 */
public class A018676 extends FiniteSequence {

  /** Construct the sequence. */
  public A018676() {
    super(Cheetah.factor(840).divisorsSorted());
  }
}
