package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018427.
 * @author Sean A. Irvine
 */
public class A018427 extends FiniteSequence {

  /** Construct the sequence. */
  public A018427() {
    super(Cheetah.factor(387).divisorsSorted());
  }
}
