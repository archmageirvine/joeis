package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073952.
 * @author Sean A. Irvine
 */
public class A073952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073952() {
    super(new long[] {27, -36, 27, -15, 6}, new long[] {0, 0, 3, 12, 30});
  }
}
