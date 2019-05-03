package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260918 Number of squares of all sizes in polyominoes obtained by union of two pyramidal figures <code>(A092498)</code> with intersection equals <code>A002623</code>.
 * @author Sean A. Irvine
 */
public class A260918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260918() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 1, 5, 15, 33, 60, 100});
  }
}
