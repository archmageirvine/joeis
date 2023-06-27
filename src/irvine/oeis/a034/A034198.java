package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034198 Number of binary codes (not necessarily linear) of length n with 3 words.
 * @author Sean A. Irvine
 */
public class A034198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034198() {
    super(1, new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 1, 3, 6, 10, 16, 23});
  }
}
