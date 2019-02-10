package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018280.
 * @author Sean A. Irvine
 */
public class A018280 extends FiniteSequence {

  /** Construct the sequence. */
  public A018280() {
    super(Cheetah.factor(96).divisorsSorted());
  }
}
