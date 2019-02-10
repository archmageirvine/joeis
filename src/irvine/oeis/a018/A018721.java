package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018721.
 * @author Sean A. Irvine
 */
public class A018721 extends FiniteSequence {

  /** Construct the sequence. */
  public A018721() {
    super(Cheetah.factor(918).divisorsSorted());
  }
}
