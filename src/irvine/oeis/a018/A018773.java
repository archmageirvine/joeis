package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018773.
 * @author Sean A. Irvine
 */
public class A018773 extends FiniteSequence {

  /** Construct the sequence. */
  public A018773() {
    super(Cheetah.factor(1010).divisorsSorted());
  }
}
