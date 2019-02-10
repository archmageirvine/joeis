package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018699.
 * @author Sean A. Irvine
 */
public class A018699 extends FiniteSequence {

  /** Construct the sequence. */
  public A018699() {
    super(Cheetah.factor(880).divisorsSorted());
  }
}
