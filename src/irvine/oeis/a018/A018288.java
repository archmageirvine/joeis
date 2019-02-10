package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018288.
 * @author Sean A. Irvine
 */
public class A018288 extends FiniteSequence {

  /** Construct the sequence. */
  public A018288() {
    super(Cheetah.factor(110).divisorsSorted());
  }
}
