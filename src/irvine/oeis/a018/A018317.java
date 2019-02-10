package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018317.
 * @author Sean A. Irvine
 */
public class A018317 extends FiniteSequence {

  /** Construct the sequence. */
  public A018317() {
    super(Cheetah.factor(172).divisorsSorted());
  }
}
