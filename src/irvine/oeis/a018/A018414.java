package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018414.
 * @author Sean A. Irvine
 */
public class A018414 extends FiniteSequence {

  /** Construct the sequence. */
  public A018414() {
    super(Cheetah.factor(364).divisorsSorted());
  }
}
