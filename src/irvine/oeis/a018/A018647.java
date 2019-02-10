package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018647.
 * @author Sean A. Irvine
 */
public class A018647 extends FiniteSequence {

  /** Construct the sequence. */
  public A018647() {
    super(Cheetah.factor(788).divisorsSorted());
  }
}
