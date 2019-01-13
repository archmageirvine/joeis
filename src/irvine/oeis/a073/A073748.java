package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073748.
 * @author Sean A. Irvine
 */
public class A073748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073748() {
    super(new long[] {-1, 0, -1, 6, 3, 2}, new long[] {-3, 3, 3, 21, 77, 231});
  }
}
