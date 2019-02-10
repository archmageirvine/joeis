package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018355.
 * @author Sean A. Irvine
 */
public class A018355 extends FiniteSequence {

  /** Construct the sequence. */
  public A018355() {
    super(Cheetah.factor(248).divisorsSorted());
  }
}
