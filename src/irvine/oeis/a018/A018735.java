package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018735.
 * @author Sean A. Irvine
 */
public class A018735 extends FiniteSequence {

  /** Construct the sequence. */
  public A018735() {
    super(Cheetah.factor(944).divisorsSorted());
  }
}
