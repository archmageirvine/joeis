package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018513.
 * @author Sean A. Irvine
 */
public class A018513 extends FiniteSequence {

  /** Construct the sequence. */
  public A018513() {
    super(Cheetah.factor(549).divisorsSorted());
  }
}
