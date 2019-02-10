package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018554.
 * @author Sean A. Irvine
 */
public class A018554 extends FiniteSequence {

  /** Construct the sequence. */
  public A018554() {
    super(Cheetah.factor(620).divisorsSorted());
  }
}
