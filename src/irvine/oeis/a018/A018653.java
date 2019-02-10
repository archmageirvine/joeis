package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018653.
 * @author Sean A. Irvine
 */
public class A018653 extends FiniteSequence {

  /** Construct the sequence. */
  public A018653() {
    super(Cheetah.factor(800).divisorsSorted());
  }
}
