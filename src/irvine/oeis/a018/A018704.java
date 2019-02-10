package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018704.
 * @author Sean A. Irvine
 */
public class A018704 extends FiniteSequence {

  /** Construct the sequence. */
  public A018704() {
    super(Cheetah.factor(890).divisorsSorted());
  }
}
