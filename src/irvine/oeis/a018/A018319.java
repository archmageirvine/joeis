package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018319.
 * @author Sean A. Irvine
 */
public class A018319 extends FiniteSequence {

  /** Construct the sequence. */
  public A018319() {
    super(Cheetah.factor(175).divisorsSorted());
  }
}
