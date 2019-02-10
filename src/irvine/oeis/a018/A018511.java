package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018511.
 * @author Sean A. Irvine
 */
public class A018511 extends FiniteSequence {

  /** Construct the sequence. */
  public A018511() {
    super(Cheetah.factor(546).divisorsSorted());
  }
}
