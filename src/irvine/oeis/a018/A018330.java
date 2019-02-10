package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018330.
 * @author Sean A. Irvine
 */
public class A018330 extends FiniteSequence {

  /** Construct the sequence. */
  public A018330() {
    super(Cheetah.factor(196).divisorsSorted());
  }
}
