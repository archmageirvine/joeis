package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018541.
 * @author Sean A. Irvine
 */
public class A018541 extends FiniteSequence {

  /** Construct the sequence. */
  public A018541() {
    super(Cheetah.factor(600).divisorsSorted());
  }
}
