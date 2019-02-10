package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018606.
 * @author Sean A. Irvine
 */
public class A018606 extends FiniteSequence {

  /** Construct the sequence. */
  public A018606() {
    super(Cheetah.factor(714).divisorsSorted());
  }
}
