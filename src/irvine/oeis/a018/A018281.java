package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018281.
 * @author Sean A. Irvine
 */
public class A018281 extends FiniteSequence {

  /** Construct the sequence. */
  public A018281() {
    super(Cheetah.factor(98).divisorsSorted());
  }
}
