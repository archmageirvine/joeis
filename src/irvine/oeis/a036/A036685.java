package irvine.oeis.a036;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002188;

/**
 * A036685 List of single-heap P-positions in Grundy's game.
 * @author Sean A. Irvine
 */
public class A036685 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A036685() {
    super(0, new A002188(), 0);
  }
}
