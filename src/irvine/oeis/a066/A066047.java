package irvine.oeis.a066;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001045;

/**
 * A066047 Numbers k that divide A001045(k-1).
 * @author Sean A. Irvine
 */
public class A066047 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066047() {
    super(1, 1, new A001045(), DIVISIBLE_BY_INDEX);
    next();
  }
}
