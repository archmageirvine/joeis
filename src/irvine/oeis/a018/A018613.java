package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018613.
 * @author Sean A. Irvine
 */
public class A018613 extends FiniteSequence {

  /** Construct the sequence. */
  public A018613() {
    super(Cheetah.factor(726).divisorsSorted());
  }
}
