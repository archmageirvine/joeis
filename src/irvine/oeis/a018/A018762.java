package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018762.
 * @author Sean A. Irvine
 */
public class A018762 extends FiniteSequence {

  /** Construct the sequence. */
  public A018762() {
    super(Cheetah.factor(990).divisorsSorted());
  }
}
