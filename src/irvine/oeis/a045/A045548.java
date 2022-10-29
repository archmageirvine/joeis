package irvine.oeis.a045;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008904;

/**
 * A045548 Numbers whose factorial has '4' as its final nonzero digit.
 * @author Sean A. Irvine
 */
public class A045548 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A045548() {
    super(0, new A008904(), 4);
  }
}
