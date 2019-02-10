package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018697.
 * @author Sean A. Irvine
 */
public class A018697 extends FiniteSequence {

  /** Construct the sequence. */
  public A018697() {
    super(Cheetah.factor(875).divisorsSorted());
  }
}
