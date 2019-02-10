package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018715.
 * @author Sean A. Irvine
 */
public class A018715 extends FiniteSequence {

  /** Construct the sequence. */
  public A018715() {
    super(Cheetah.factor(908).divisorsSorted());
  }
}
