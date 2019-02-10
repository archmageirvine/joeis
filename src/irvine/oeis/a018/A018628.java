package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018628.
 * @author Sean A. Irvine
 */
public class A018628 extends FiniteSequence {

  /** Construct the sequence. */
  public A018628() {
    super(Cheetah.factor(754).divisorsSorted());
  }
}
