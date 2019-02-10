package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018516.
 * @author Sean A. Irvine
 */
public class A018516 extends FiniteSequence {

  /** Construct the sequence. */
  public A018516() {
    super(Cheetah.factor(555).divisorsSorted());
  }
}
