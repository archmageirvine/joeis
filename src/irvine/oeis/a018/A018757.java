package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018757.
 * @author Sean A. Irvine
 */
public class A018757 extends FiniteSequence {

  /** Construct the sequence. */
  public A018757() {
    super(Cheetah.factor(981).divisorsSorted());
  }
}
