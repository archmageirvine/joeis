package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018563.
 * @author Sean A. Irvine
 */
public class A018563 extends FiniteSequence {

  /** Construct the sequence. */
  public A018563() {
    super(Cheetah.factor(638).divisorsSorted());
  }
}
