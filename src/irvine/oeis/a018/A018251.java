package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018251.
 * @author Sean A. Irvine
 */
public class A018251 extends FiniteSequence {

  /** Construct the sequence. */
  public A018251() {
    super(Cheetah.factor(18).divisorsSorted());
  }
}

