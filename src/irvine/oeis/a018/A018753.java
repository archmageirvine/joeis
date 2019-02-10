package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018753.
 * @author Sean A. Irvine
 */
public class A018753 extends FiniteSequence {

  /** Construct the sequence. */
  public A018753() {
    super(Cheetah.factor(975).divisorsSorted());
  }
}
