package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018321.
 * @author Sean A. Irvine
 */
public class A018321 extends FiniteSequence {

  /** Construct the sequence. */
  public A018321() {
    super(Cheetah.factor(180).divisorsSorted());
  }
}
