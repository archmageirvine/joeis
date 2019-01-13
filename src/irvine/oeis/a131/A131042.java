package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131042.
 * @author Sean A. Irvine
 */
public class A131042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131042() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 3, 5, 6, 7});
  }
}
