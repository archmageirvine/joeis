package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018558.
 * @author Sean A. Irvine
 */
public class A018558 extends FiniteSequence {

  /** Construct the sequence. */
  public A018558() {
    super(Cheetah.factor(628).divisorsSorted());
  }
}
