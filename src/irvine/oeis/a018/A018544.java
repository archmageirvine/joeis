package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018544.
 * @author Sean A. Irvine
 */
public class A018544 extends FiniteSequence {

  /** Construct the sequence. */
  public A018544() {
    super(Cheetah.factor(604).divisorsSorted());
  }
}
