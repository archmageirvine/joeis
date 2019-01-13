package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187397.
 * @author Sean A. Irvine
 */
public class A187397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187397() {
    super(new long[] {0, 0, 0, 0, -1, 0, 0, 2, 2, 0, -1, -4, -1, 0, 2, 2, 0, 0}, new long[] {0, 0, 0, 0, 10, 16, 22, 36, 54, 66, 92, 122, 156, 196, 240, 288, 366, 426});
  }
}
