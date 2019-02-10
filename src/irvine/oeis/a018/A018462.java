package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018462.
 * @author Sean A. Irvine
 */
public class A018462 extends FiniteSequence {

  /** Construct the sequence. */
  public A018462() {
    super(Cheetah.factor(450).divisorsSorted());
  }
}
