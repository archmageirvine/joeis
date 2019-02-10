package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018327.
 * @author Sean A. Irvine
 */
public class A018327 extends FiniteSequence {

  /** Construct the sequence. */
  public A018327() {
    super(Cheetah.factor(190).divisorsSorted());
  }
}
