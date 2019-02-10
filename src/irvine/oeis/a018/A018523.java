package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018523.
 * @author Sean A. Irvine
 */
public class A018523 extends FiniteSequence {

  /** Construct the sequence. */
  public A018523() {
    super(Cheetah.factor(568).divisorsSorted());
  }
}
