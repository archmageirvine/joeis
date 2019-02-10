package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018728.
 * @author Sean A. Irvine
 */
public class A018728 extends FiniteSequence {

  /** Construct the sequence. */
  public A018728() {
    super(Cheetah.factor(931).divisorsSorted());
  }
}
