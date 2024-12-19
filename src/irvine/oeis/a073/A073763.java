package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;

/**
 * A073763 Least number of unrelated set belonging to these numbers is odd.
 * @author Sean A. Irvine
 */
public class A073763 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073763() {
    super(1, new A073758(), ODD);
  }
}
