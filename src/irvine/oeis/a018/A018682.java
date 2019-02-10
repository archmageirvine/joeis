package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018682.
 * @author Sean A. Irvine
 */
public class A018682 extends FiniteSequence {

  /** Construct the sequence. */
  public A018682() {
    super(Cheetah.factor(850).divisorsSorted());
  }
}
