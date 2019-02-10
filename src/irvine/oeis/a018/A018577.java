package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018577.
 * @author Sean A. Irvine
 */
public class A018577 extends FiniteSequence {

  /** Construct the sequence. */
  public A018577() {
    super(Cheetah.factor(658).divisorsSorted());
  }
}
