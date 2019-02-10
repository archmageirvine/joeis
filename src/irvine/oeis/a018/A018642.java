package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018642.
 * @author Sean A. Irvine
 */
public class A018642 extends FiniteSequence {

  /** Construct the sequence. */
  public A018642() {
    super(Cheetah.factor(780).divisorsSorted());
  }
}
