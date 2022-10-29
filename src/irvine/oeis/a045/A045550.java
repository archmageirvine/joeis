package irvine.oeis.a045;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008904;

/**
 * A045550 Numbers whose factorial has '8' as its final nonzero digit.
 * @author Sean A. Irvine
 */
public class A045550 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A045550() {
    super(0, new A008904(), 8);
  }
}
