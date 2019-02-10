package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018352.
 * @author Sean A. Irvine
 */
public class A018352 extends FiniteSequence {

  /** Construct the sequence. */
  public A018352() {
    super(Cheetah.factor(244).divisorsSorted());
  }
}
