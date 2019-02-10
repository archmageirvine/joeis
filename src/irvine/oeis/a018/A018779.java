package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018779.
 * @author Sean A. Irvine
 */
public class A018779 extends FiniteSequence {

  /** Construct the sequence. */
  public A018779() {
    super(Cheetah.factor(1020).divisorsSorted());
  }
}
