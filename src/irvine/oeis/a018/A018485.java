package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018485.
 * @author Sean A. Irvine
 */
public class A018485 extends FiniteSequence {

  /** Construct the sequence. */
  public A018485() {
    super(Cheetah.factor(494).divisorsSorted());
  }
}
