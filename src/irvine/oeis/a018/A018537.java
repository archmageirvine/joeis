package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018537.
 * @author Sean A. Irvine
 */
public class A018537 extends FiniteSequence {

  /** Construct the sequence. */
  public A018537() {
    super(Cheetah.factor(594).divisorsSorted());
  }
}
