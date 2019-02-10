package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018307.
 * @author Sean A. Irvine
 */
public class A018307 extends FiniteSequence {

  /** Construct the sequence. */
  public A018307() {
    super(Cheetah.factor(153).divisorsSorted());
  }
}
