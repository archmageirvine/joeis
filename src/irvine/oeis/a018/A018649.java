package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018649.
 * @author Sean A. Irvine
 */
public class A018649 extends FiniteSequence {

  /** Construct the sequence. */
  public A018649() {
    super(Cheetah.factor(792).divisorsSorted());
  }
}
