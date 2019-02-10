package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018698.
 * @author Sean A. Irvine
 */
public class A018698 extends FiniteSequence {

  /** Construct the sequence. */
  public A018698() {
    super(Cheetah.factor(876).divisorsSorted());
  }
}
