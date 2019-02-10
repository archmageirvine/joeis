package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018390.
 * @author Sean A. Irvine
 */
public class A018390 extends FiniteSequence {

  /** Construct the sequence. */
  public A018390() {
    super(Cheetah.factor(318).divisorsSorted());
  }
}
