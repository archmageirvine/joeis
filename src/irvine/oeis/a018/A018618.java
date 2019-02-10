package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018618.
 * @author Sean A. Irvine
 */
public class A018618 extends FiniteSequence {

  /** Construct the sequence. */
  public A018618() {
    super(Cheetah.factor(736).divisorsSorted());
  }
}
