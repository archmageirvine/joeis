package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018564.
 * @author Sean A. Irvine
 */
public class A018564 extends FiniteSequence {

  /** Construct the sequence. */
  public A018564() {
    super(Cheetah.factor(639).divisorsSorted());
  }
}
