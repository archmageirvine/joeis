package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018652.
 * @author Sean A. Irvine
 */
public class A018652 extends FiniteSequence {

  /** Construct the sequence. */
  public A018652() {
    super(Cheetah.factor(798).divisorsSorted());
  }
}
