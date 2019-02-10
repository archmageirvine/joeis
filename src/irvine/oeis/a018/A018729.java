package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018729.
 * @author Sean A. Irvine
 */
public class A018729 extends FiniteSequence {

  /** Construct the sequence. */
  public A018729() {
    super(Cheetah.factor(932).divisorsSorted());
  }
}
