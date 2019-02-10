package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018612.
 * @author Sean A. Irvine
 */
public class A018612 extends FiniteSequence {

  /** Construct the sequence. */
  public A018612() {
    super(Cheetah.factor(725).divisorsSorted());
  }
}
