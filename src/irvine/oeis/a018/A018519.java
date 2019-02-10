package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018519.
 * @author Sean A. Irvine
 */
public class A018519 extends FiniteSequence {

  /** Construct the sequence. */
  public A018519() {
    super(Cheetah.factor(560).divisorsSorted());
  }
}
