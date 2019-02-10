package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018491.
 * @author Sean A. Irvine
 */
public class A018491 extends FiniteSequence {

  /** Construct the sequence. */
  public A018491() {
    super(Cheetah.factor(506).divisorsSorted());
  }
}
