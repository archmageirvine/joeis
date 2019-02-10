package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018260.
 * @author Sean A. Irvine
 */
public class A018260 extends FiniteSequence {

  /** Construct the sequence. */
  public A018260() {
    super(Cheetah.factor(45).divisorsSorted());
  }
}

