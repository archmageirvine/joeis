package irvine.oeis.a045;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008904;

/**
 * A045549 Numbers whose factorial has '6' as its final nonzero digit.
 * @author Sean A. Irvine
 */
public class A045549 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A045549() {
    super(0, new A008904(), 6);
  }
}
