package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018548.
 * @author Sean A. Irvine
 */
public class A018548 extends FiniteSequence {

  /** Construct the sequence. */
  public A018548() {
    super(Cheetah.factor(609).divisorsSorted());
  }
}
