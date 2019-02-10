package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018324.
 * @author Sean A. Irvine
 */
public class A018324 extends FiniteSequence {

  /** Construct the sequence. */
  public A018324() {
    super(Cheetah.factor(186).divisorsSorted());
  }
}
