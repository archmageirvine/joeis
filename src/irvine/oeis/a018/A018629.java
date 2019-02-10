package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018629.
 * @author Sean A. Irvine
 */
public class A018629 extends FiniteSequence {

  /** Construct the sequence. */
  public A018629() {
    super(Cheetah.factor(756).divisorsSorted());
  }
}
