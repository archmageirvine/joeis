package irvine.oeis.a358;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a342.A342991;

/**
 * A358510 Positions of zeros in A342991.
 * @author Sean A. Irvine
 */
public class A358510 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A358510() {
    super(1, new A342991(), 0);
  }
}
