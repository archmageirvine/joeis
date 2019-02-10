package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018344.
 * @author Sean A. Irvine
 */
public class A018344 extends FiniteSequence {

  /** Construct the sequence. */
  public A018344() {
    super(Cheetah.factor(230).divisorsSorted());
  }
}
