package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018739.
 * @author Sean A. Irvine
 */
public class A018739 extends FiniteSequence {

  /** Construct the sequence. */
  public A018739() {
    super(Cheetah.factor(950).divisorsSorted());
  }
}
