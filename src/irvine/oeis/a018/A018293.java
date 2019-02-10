package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018293.
 * @author Sean A. Irvine
 */
public class A018293 extends FiniteSequence {

  /** Construct the sequence. */
  public A018293() {
    super(Cheetah.factor(120).divisorsSorted());
  }
}
