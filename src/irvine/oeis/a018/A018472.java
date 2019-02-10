package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018472.
 * @author Sean A. Irvine
 */
public class A018472 extends FiniteSequence {

  /** Construct the sequence. */
  public A018472() {
    super(Cheetah.factor(470).divisorsSorted());
  }
}
