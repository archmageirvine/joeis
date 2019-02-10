package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018421.
 * @author Sean A. Irvine
 */
public class A018421 extends FiniteSequence {

  /** Construct the sequence. */
  public A018421() {
    super(Cheetah.factor(375).divisorsSorted());
  }
}
