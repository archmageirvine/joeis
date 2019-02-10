package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018521.
 * @author Sean A. Irvine
 */
public class A018521 extends FiniteSequence {

  /** Construct the sequence. */
  public A018521() {
    super(Cheetah.factor(564).divisorsSorted());
  }
}
