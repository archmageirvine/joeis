package irvine.oeis.a102;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005554;

/**
 * A102071 Pairwise sums of general ballot numbers <code>(A002026)</code>.
 * @author Sean A. Irvine
 */
public class A102071 extends DifferenceSequence {

  /** Construct the sequence. */
  public A102071() {
    super(new SkipSequence(new A005554(), 1));
  }
}
