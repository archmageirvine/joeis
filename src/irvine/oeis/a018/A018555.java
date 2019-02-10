package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018555.
 * @author Sean A. Irvine
 */
public class A018555 extends FiniteSequence {

  /** Construct the sequence. */
  public A018555() {
    super(Cheetah.factor(621).divisorsSorted());
  }
}
