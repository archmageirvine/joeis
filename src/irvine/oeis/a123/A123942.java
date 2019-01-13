package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123942.
 * @author Sean A. Irvine
 */
public class A123942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123942() {
    super(new long[] {-1, -1, 4, 4}, new long[] {0, 1, 3, 15});
  }
}
