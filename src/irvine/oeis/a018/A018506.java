package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018506.
 * @author Sean A. Irvine
 */
public class A018506 extends FiniteSequence {

  /** Construct the sequence. */
  public A018506() {
    super(Cheetah.factor(534).divisorsSorted());
  }
}
