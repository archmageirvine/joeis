package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018767.
 * @author Sean A. Irvine
 */
public class A018767 extends FiniteSequence {

  /** Construct the sequence. */
  public A018767() {
    super(Cheetah.factor(1000).divisorsSorted());
  }
}
