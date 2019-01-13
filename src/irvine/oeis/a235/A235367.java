package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235367.
 * @author Sean A. Irvine
 */
public class A235367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235367() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 6, 20, 72, 156, 342, 600, 1056});
  }
}
