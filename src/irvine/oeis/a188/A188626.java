package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188626 a(n) = n + (n-1)*2^(n-2).
 * @author Sean A. Irvine
 */
public class A188626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188626() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 3, 7, 16});
  }
}
