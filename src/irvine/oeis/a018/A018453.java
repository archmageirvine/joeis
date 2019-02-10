package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018453.
 * @author Sean A. Irvine
 */
public class A018453 extends FiniteSequence {

  /** Construct the sequence. */
  public A018453() {
    super(Cheetah.factor(434).divisorsSorted());
  }
}
