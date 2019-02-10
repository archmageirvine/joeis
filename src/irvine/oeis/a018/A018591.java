package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018591.
 * @author Sean A. Irvine
 */
public class A018591 extends FiniteSequence {

  /** Construct the sequence. */
  public A018591() {
    super(Cheetah.factor(684).divisorsSorted());
  }
}
