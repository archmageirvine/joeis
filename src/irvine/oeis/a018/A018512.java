package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018512.
 * @author Sean A. Irvine
 */
public class A018512 extends FiniteSequence {

  /** Construct the sequence. */
  public A018512() {
    super(Cheetah.factor(548).divisorsSorted());
  }
}
