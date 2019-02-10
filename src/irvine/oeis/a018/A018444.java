package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018444.
 * @author Sean A. Irvine
 */
public class A018444 extends FiniteSequence {

  /** Construct the sequence. */
  public A018444() {
    super(Cheetah.factor(420).divisorsSorted());
  }
}
