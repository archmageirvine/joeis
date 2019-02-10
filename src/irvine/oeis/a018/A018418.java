package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018418.
 * @author Sean A. Irvine
 */
public class A018418 extends FiniteSequence {

  /** Construct the sequence. */
  public A018418() {
    super(Cheetah.factor(370).divisorsSorted());
  }
}
