package irvine.oeis.a358;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a342.A342991;

/**
 * A358511 Positions of ones in A342991.
 * @author Sean A. Irvine
 */
public class A358511 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A358511() {
    super(1, new A342991(), 1);
  }
}
