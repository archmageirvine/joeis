package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018609.
 * @author Sean A. Irvine
 */
public class A018609 extends FiniteSequence {

  /** Construct the sequence. */
  public A018609() {
    super(Cheetah.factor(720).divisorsSorted());
  }
}
