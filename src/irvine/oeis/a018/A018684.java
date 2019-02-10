package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018684.
 * @author Sean A. Irvine
 */
public class A018684 extends FiniteSequence {

  /** Construct the sequence. */
  public A018684() {
    super(Cheetah.factor(854).divisorsSorted());
  }
}
