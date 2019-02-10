package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018546.
 * @author Sean A. Irvine
 */
public class A018546 extends FiniteSequence {

  /** Construct the sequence. */
  public A018546() {
    super(Cheetah.factor(606).divisorsSorted());
  }
}
