package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018456.
 * @author Sean A. Irvine
 */
public class A018456 extends FiniteSequence {

  /** Construct the sequence. */
  public A018456() {
    super(Cheetah.factor(438).divisorsSorted());
  }
}
