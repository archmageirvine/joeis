package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018312.
 * @author Sean A. Irvine
 */
public class A018312 extends FiniteSequence {

  /** Construct the sequence. */
  public A018312() {
    super(Cheetah.factor(164).divisorsSorted());
  }
}
