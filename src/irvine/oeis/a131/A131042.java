package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131042 Natural numbers A000027 with 6n+3 and 6n+4 terms swapped.
 * @author Sean A. Irvine
 */
public class A131042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131042() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 3, 5, 6, 7});
  }
}
