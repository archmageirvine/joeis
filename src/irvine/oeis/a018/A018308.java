package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018308.
 * @author Sean A. Irvine
 */
public class A018308 extends FiniteSequence {

  /** Construct the sequence. */
  public A018308() {
    super(Cheetah.factor(154).divisorsSorted());
  }
}
