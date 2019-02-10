package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018714.
 * @author Sean A. Irvine
 */
public class A018714 extends FiniteSequence {

  /** Construct the sequence. */
  public A018714() {
    super(Cheetah.factor(906).divisorsSorted());
  }
}
