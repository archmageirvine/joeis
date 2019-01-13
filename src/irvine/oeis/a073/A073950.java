package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073950.
 * @author Sean A. Irvine
 */
public class A073950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073950() {
    super(new long[] {27, -36, 27, -15, 6}, new long[] {1, 2, 3, 9, 30});
  }
}
