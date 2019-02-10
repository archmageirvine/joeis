package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018285.
 * @author Sean A. Irvine
 */
public class A018285 extends FiniteSequence {

  /** Construct the sequence. */
  public A018285() {
    super(Cheetah.factor(104).divisorsSorted());
  }
}
