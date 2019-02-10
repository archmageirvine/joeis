package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018384.
 * @author Sean A. Irvine
 */
public class A018384 extends FiniteSequence {

  /** Construct the sequence. */
  public A018384() {
    super(Cheetah.factor(306).divisorsSorted());
  }
}
