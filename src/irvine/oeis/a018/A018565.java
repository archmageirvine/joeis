package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018565.
 * @author Sean A. Irvine
 */
public class A018565 extends FiniteSequence {

  /** Construct the sequence. */
  public A018565() {
    super(Cheetah.factor(640).divisorsSorted());
  }
}
