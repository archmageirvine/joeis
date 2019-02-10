package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018469.
 * @author Sean A. Irvine
 */
public class A018469 extends FiniteSequence {

  /** Construct the sequence. */
  public A018469() {
    super(Cheetah.factor(464).divisorsSorted());
  }
}
