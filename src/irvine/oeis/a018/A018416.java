package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018416.
 * @author Sean A. Irvine
 */
public class A018416 extends FiniteSequence {

  /** Construct the sequence. */
  public A018416() {
    super(Cheetah.factor(368).divisorsSorted());
  }
}
