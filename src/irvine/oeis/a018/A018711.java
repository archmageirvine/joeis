package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018711.
 * @author Sean A. Irvine
 */
public class A018711 extends FiniteSequence {

  /** Construct the sequence. */
  public A018711() {
    super(Cheetah.factor(902).divisorsSorted());
  }
}
