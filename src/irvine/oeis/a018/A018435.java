package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018435.
 * @author Sean A. Irvine
 */
public class A018435 extends FiniteSequence {

  /** Construct the sequence. */
  public A018435() {
    super(Cheetah.factor(404).divisorsSorted());
  }
}
