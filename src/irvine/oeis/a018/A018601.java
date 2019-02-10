package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018601.
 * @author Sean A. Irvine
 */
public class A018601 extends FiniteSequence {

  /** Construct the sequence. */
  public A018601() {
    super(Cheetah.factor(705).divisorsSorted());
  }
}
