package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018378.
 * @author Sean A. Irvine
 */
public class A018378 extends FiniteSequence {

  /** Construct the sequence. */
  public A018378() {
    super(Cheetah.factor(292).divisorsSorted());
  }
}
