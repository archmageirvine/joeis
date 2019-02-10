package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018529.
 * @author Sean A. Irvine
 */
public class A018529 extends FiniteSequence {

  /** Construct the sequence. */
  public A018529() {
    super(Cheetah.factor(578).divisorsSorted());
  }
}
