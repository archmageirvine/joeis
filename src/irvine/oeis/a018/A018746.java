package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018746.
 * @author Sean A. Irvine
 */
public class A018746 extends FiniteSequence {

  /** Construct the sequence. */
  public A018746() {
    super(Cheetah.factor(963).divisorsSorted());
  }
}
