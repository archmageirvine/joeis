package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018255.
 * @author Sean A. Irvine
 */
public class A018255 extends FiniteSequence {

  /** Construct the sequence. */
  public A018255() {
    super(Cheetah.factor(30).divisorsSorted());
  }
}

