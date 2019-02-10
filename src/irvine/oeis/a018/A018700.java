package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018700.
 * @author Sean A. Irvine
 */
public class A018700 extends FiniteSequence {

  /** Construct the sequence. */
  public A018700() {
    super(Cheetah.factor(882).divisorsSorted());
  }
}
