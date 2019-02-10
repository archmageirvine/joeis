package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018371.
 * @author Sean A. Irvine
 */
public class A018371 extends FiniteSequence {

  /** Construct the sequence. */
  public A018371() {
    super(Cheetah.factor(280).divisorsSorted());
  }
}
