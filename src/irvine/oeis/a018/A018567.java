package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018567.
 * @author Sean A. Irvine
 */
public class A018567 extends FiniteSequence {

  /** Construct the sequence. */
  public A018567() {
    super(Cheetah.factor(644).divisorsSorted());
  }
}
