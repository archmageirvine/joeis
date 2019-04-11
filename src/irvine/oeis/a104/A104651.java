package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104651 Numbers n such that <code>n^2 = 29*k^2 + 29*k +1, k</code> sequence = A104652.
 * @author Sean A. Irvine
 */
public class A104651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104651() {
    super(new long[] {-1, 0, 0, 19602, 0, 0}, new long[] {1, 175, 16589, 36191, 3430525, 325177579});
  }
}
