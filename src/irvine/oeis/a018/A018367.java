package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018367.
 * @author Sean A. Irvine
 */
public class A018367 extends FiniteSequence {

  /** Construct the sequence. */
  public A018367() {
    super(Cheetah.factor(273).divisorsSorted());
  }
}
