package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048914 Indices of pentagonal numbers which are also 9-gonal.
 * @author Sean A. Irvine
 */
public class A048914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048914() {
    super(1, new long[] {1, -1, -12098, 12098, 1}, new long[] {1, 21, 10981, 252081, 132846121});
  }
}
