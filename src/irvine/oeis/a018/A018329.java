package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018329.
 * @author Sean A. Irvine
 */
public class A018329 extends FiniteSequence {

  /** Construct the sequence. */
  public A018329() {
    super(Cheetah.factor(195).divisorsSorted());
  }
}
