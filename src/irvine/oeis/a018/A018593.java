package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018593.
 * @author Sean A. Irvine
 */
public class A018593 extends FiniteSequence {

  /** Construct the sequence. */
  public A018593() {
    super(Cheetah.factor(688).divisorsSorted());
  }
}
