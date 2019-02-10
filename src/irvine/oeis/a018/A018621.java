package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018621.
 * @author Sean A. Irvine
 */
public class A018621 extends FiniteSequence {

  /** Construct the sequence. */
  public A018621() {
    super(Cheetah.factor(741).divisorsSorted());
  }
}
