package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018359.
 * @author Sean A. Irvine
 */
public class A018359 extends FiniteSequence {

  /** Construct the sequence. */
  public A018359() {
    super(Cheetah.factor(258).divisorsSorted());
  }
}
